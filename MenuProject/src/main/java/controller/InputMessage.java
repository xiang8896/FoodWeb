package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MessageBoardEntity;
import model.UserFunction;

@WebServlet("/ms")
public class InputMessage extends HttpServlet {
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
		request.setCharacterEncoding("UTF-8");
		String speech = request.getParameter("speech");
		
		if(speech.length() != 0) {
			user.addMessage(getUsername(request), speech);
			response.sendRedirect("sc");
			return;
		}
		else {
			request.getRequestDispatcher("sc").forward(request, response);
		}
		
		
		
	}
	
	private String getUsername(HttpServletRequest request) {
        return  (String) request.getSession().getAttribute("login");
    }

}
