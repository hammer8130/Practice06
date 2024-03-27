package com.javaex.ex05;

public class Depart extends Employee{
	String depart;
	 //코드작성
	public Depart(String name, int salary, String depart) {
		super(name,salary);
		this.depart=depart;
	}
	
	public String getDepart() {
		return depart;
	}
	
	public void setDepart(String depart) {
		this.depart=depart;
	}
	
	@Override
	public void showInformation() {
        System.out.printf("이름:%s 연봉:%d 부서:%s",getName(),getSalary(),depart);
    }
}
