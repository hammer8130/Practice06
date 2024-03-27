package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		//Shape 생성자 (2) 실행
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		//Shape 생성자 (0) 실행
		//Triangle 생성자 (0) 실행
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		//Shape 생성자(2) 실행
		//Triangle 생성자 (2) 실행
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		//Shape 생성자(2) 실행
		//Triangle 생성자 (4) 실행
	}

}

