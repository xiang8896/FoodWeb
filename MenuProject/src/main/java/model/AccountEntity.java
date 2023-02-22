package model;

public class AccountEntity {
	private String username;
	private String userpass;
	private String readlname;
	private String sex;
	private String email;
	private String phone;
	
	public AccountEntity(String username, String userpass, String readlname, String sex, String email, String phone) {
		super();
		this.username = username;
		this.userpass = userpass;
		this.readlname = readlname;
		this.sex = sex;
		this.email = email;
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	public String getReadlname() {
		return readlname;
	}

	public void setReadlname(String readlname) {
		this.readlname = readlname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
}
