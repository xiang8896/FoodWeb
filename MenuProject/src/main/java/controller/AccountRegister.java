package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AccountDAO;
import model.AccountEntity;
import model.AccountImpl;
import model.UserFunction;

@WebServlet("/bbb")
public class AccountRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserFunction user;
	private AccountDAO userDAO;
	
	private final Pattern userRegex = Pattern.compile("^\\w{8,16}$");
	private final Pattern passRegex = Pattern.compile("^\\w{8,16}$");
	private final Pattern userEmail = Pattern.compile("^[a-z0-9-]+@[a-z0-9-]+([.][a-z0-9-]+)*$");
	private final Pattern userPhone = Pattern.compile("^09[0-9]{8}$");
	
	public void init() throws ServletException {
		user = (UserFunction)getServletContext().getAttribute("userFunction");
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		
		String rUserName = request.getParameter("rUserName");
		String rUserPass = request.getParameter("rUserPass");
		String rUserPass2 = request.getParameter("rUserPass2");
		String realName = request.getParameter("realName");
		String sex = request.getParameter("sex");
		String rUserEmail = request.getParameter("rUserEmail");
		String phone = request.getParameter("phone");
		
		
		
		var errorMessage = new ArrayList<String>();
		if(!checkUsername(rUserName)) {
			errorMessage.add("請確認帳號格式");
		}
		if(!checkUserpass(rUserPass,rUserPass2)) {
			errorMessage.add("請確認密碼格式或是確認密碼錯誤");
		}
		if(!checkEmail(rUserEmail)) {
			errorMessage.add("請確認Email格式");
		}
		if(!checkPhone(phone)) {
			errorMessage.add("請確認手機格式");
		}
		
		if(errorMessage.isEmpty()) {
			user.existAccount(rUserName,rUserPass,realName,sex,rUserEmail,phone);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		else {
			request.setAttribute("errorMessages", errorMessage);
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
		
	}
	
	private boolean checkUsername(String username) {
		return userRegex.matcher(username).find();
	}
	private boolean checkUserpass(String userpass,String password2) {
		return passRegex.matcher(userpass).find() && userpass.equals(password2);
	}
	private boolean checkEmail(String email) {
		return userEmail.matcher(email).find();
	}
	private boolean checkPhone(String phone) {
		return userPhone.matcher(phone).find();
	}
	
	

}
