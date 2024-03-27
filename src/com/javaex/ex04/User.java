package com.javaex.ex04;

public class User {
	private String id;
	private String password;
	private String name;
	
	
	public User(String id,String password,String name) {
		this.id=id;
		this.password=password;
		this.name=name;
	}
	
	public User() {
		
	}
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public String getPassWord() {
		return password;
	}
	
	public void setPassWord(String password) {
		this.password=password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void showInfo() {
		System.out.printf("#아이디:%s, #패스워드:%s, #이름:%s",getId(),getPassWord(),getName());
	}
	
}
