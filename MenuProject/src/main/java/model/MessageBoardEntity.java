package model;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class MessageBoardEntity {
	private String username;
	private String time;
	private String speech;
	
	
	
	public MessageBoardEntity(String username, String time, String speech) {
		super();
		this.username = username;
		this.time = time;
		this.speech = speech;
	}

	

	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	public String getSpeech() {
		return speech;
	}



	public void setSpeech(String speech) {
		this.speech = speech;
	}



	/*public void getLocalDateTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	    String time = dtf.format(LocalDateTime.now());
	}*/
	
	
}
