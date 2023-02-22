package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserFunction {
	
	private AccountDAO userDAO;
	private MessageBoardDAO speechDAO;
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	private int oneweek = 7*24*60*60;
	
	public UserFunction(AccountDAO userDAO,MessageBoardDAO speechDAO) {
		this.userDAO = userDAO;
		this.speechDAO = speechDAO;
	}
	
	public void existAccount(String username,String userpass,String realname,String sex,String email,String phone) {
		if(userDAO.existAccount(username).isEmpty()) {
			createUser(username,userpass,realname,sex,email,phone);
		}
	}
	public void createUser(String username,String userpass,String realname,String sex,String email,String phone) {
		userpass = String.valueOf((userpass.hashCode()*356));
		userDAO.createAccount(new AccountEntity(username,userpass,realname,sex,email,phone));
	}
	
	public boolean login(String username,String userpass) {
		var checkUser = userDAO.existAccount(username);
		return checkUser.isPresent() && checkPassword(userpass,checkUser.get());
	}
	public boolean checkPassword(String userpass,AccountEntity user) {
		var password1 = Integer.parseInt(user.getUserpass());
		return userpass.hashCode()*356 == password1;
		
	}
	public List<MessageBoardEntity> messages(String username) {
        var messages = speechDAO.selectUsername(username);
        messages.sort(Comparator.comparing(MessageBoardEntity::getTime));
        return messages;
    }
	public void addMessage(String username,String speech) {
		speechDAO.speech(new MessageBoardEntity(username,dtf.format(LocalDateTime.now()),speech));
	}
	public void delSpeech(String username,String time) {
		speechDAO.delSpeech(username, time);
	}
	public void processCookie(HttpServletRequest request,HttpServletResponse response) {
		Cookie cookie = new Cookie("username",getUsername(request));
		if("true".equals(request.getParameter("autoLogin"))) {
			cookie.setMaxAge(oneweek);
		}
	}
	private String getUsername(HttpServletRequest request) {
        return (String) request.getSession().getAttribute("login");
    }
	/*public List<MessageBoardEntity> newSpeech(int n){
		return speechDAO.sequenceSpeech(n);
	}*/
}
