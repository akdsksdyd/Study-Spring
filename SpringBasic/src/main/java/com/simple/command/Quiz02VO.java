package com.simple.command;

public class Quiz02VO {

	String id;
	String pw;
	String name;
	String email;
	String pw_check;

	public Quiz02VO() {
	}

	public Quiz02VO(String id, String pw, String name, String email, String pw_check) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.pw_check = pw_check;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw_check() {
		return pw_check;
	}

	public void setPw_check(String pw_check) {
		this.pw_check = pw_check;
	}

	
	
}
