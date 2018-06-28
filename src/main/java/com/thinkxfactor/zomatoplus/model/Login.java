package com.thinkxfactor.zomatoplus.model;

public class Login {

	
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public Login(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
