package com.javaex.ex01;

public class Customer extends Person{
	int cNo;
	int point;
	
	public Customer() {
		super("Unknown","Unknown");
	}
	
	public Customer(String name, String hp, int cNo, int point) {
		super("유재석","010-2222-3333");
		this.cNo=cNo;
		this.point=point;
	}
	public int getCno() {
		return cNo;
	}
	
	public void setCno(int cNo) {
		this.cNo=cNo;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point=point;
	}
	@Override
	public void showInfo() {
		System.out.printf("#이름:%s, #핸드폰:%s, #고객번호:%d, #포인트점수:%d",getName(),getHp(),getCno(),getPoint());
	}
	
}
