package com.javaex.ex04;

public class Customer extends User {
	int point;
	
	public Customer(int point) {
		this.point=point;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point=point;
	}
	@Override
	public void showInfo() {
		System.out.printf("#아이디:%s , #패스워드:%s, #이름:%s, #포인트:%d \n",getId(),getPassWord(),getName(),getPoint());
	}
}
