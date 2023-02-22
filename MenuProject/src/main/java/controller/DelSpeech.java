package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserFunction;

/**
 * Servlet implementation class DelSpeech
 */
@WebServlet("/delspeech")
public class DelSpeech extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserFunction user;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		user = (UserFunction)getServletContext().getAttribute("userFunction");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var millis = request.getParameter("time");
		if(millis != null) {
			user.delSpeech(getUsername(request), millis);
		}
		response.sendRedirect("sc");
	}
	
	private String getUsername(HttpServletRequest request) {
        return (String) request.getSession().getAttribute("login");
    }  

}
