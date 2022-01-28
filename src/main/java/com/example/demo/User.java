package com.example.demo;

public class User {
	
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	private String email, password;

	public String getUname() {
		return email;
	}

	public void setUname(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
