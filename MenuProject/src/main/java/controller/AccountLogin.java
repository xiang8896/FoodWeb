package controller;

import java.io.IOException;
import java.util.Arrays;

import model.UserFunction;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/al")
public class AccountLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserFunction user;
	
	
	@Override
	public void init() throws ServletException {
		user = (UserFunction)getServletContext().getAttribute("userFunction");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String lUserName = request.getParameter("lUserName");
		String lUserPass = request.getParameter("lUserPass");
		
		if(user.login(lUserName, lUserPass)) {
			if(request.getSession(false) != null) {
				request.changeSessionId();
			}
			user.processCookie(request,response);
			request.getSession().setAttribute("login", lUserName);
			response.sendRedirect("sc");
		}else {
			request.setAttribute("errors", Arrays.asList("帳號或密碼錯誤，請確認帳號密碼。"));
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
}
