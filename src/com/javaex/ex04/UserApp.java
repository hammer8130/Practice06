package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User[] n1 = new User[3];
		
		
		User u1 = new Customer(1000);		
		u1.setId("jws");
		u1.setPassWord("j1234");
		u1.setName("정우성");
	
		
		n1[0]=u1;
		User u2 = new Customer(2000);
		u2.setId("yjs");
		u2.setPassWord("y2345");
		u2.setName("이효리");
		
		
		
		User u3 = new Employee(500);
		u3.setId("master");
		u3.setPassWord("m7788");
		u3.setName("운영자");
		
			
		
		
		
		n1[1]=u2;
		n1[2]=u3;
		for(int i=0;i<3;i++) {
			n1[i].showInfo();
		}
		
		
		System.out.println("운영자의 월급은 5000000원 입니다.");
		
	}

}
