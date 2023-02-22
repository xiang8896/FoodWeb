package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserFunction;

/**
 * Servlet implementation class SpeechController
 */
@WebServlet("/sc")
public class SpeechController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserFunction user;

	
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		user = (UserFunction)getServletContext().getAttribute("userFunction");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("messages",user.messages(getUsername(request)));
		request.getRequestDispatcher("message_board.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setAttribute("messages",user.messages(getUsername(request)));
		request.getRequestDispatcher("message_board.jsp").forward(request, response);
	}
	private String getUsername(HttpServletRequest request) {
        return (String) request.getSession().getAttribute("login");
    }

}
