package com.day10;

public class Test6 {
	
	int a = 5;
	
	//초기화 블럭
	//객체가 생성되면 무조건 한번 실행됨
	{
		System.out.println("초기화 블럭 a : " + a);
		a = 10;
		System.out.println("초기화 블럭 a : " + a);
	}
		
	static int b; //클래스 변수
	//static 블럭
	//객체를 생성하지 않아도 무조건 한번 실행됨
	static {
		b = 10;
		System.out.println("static 블럭 b : " + b);
	}
	
	//상수:프로그램이 실행될때 반드시 초기화 해야되고 
	//끝날때까지 변수 내용을 변경할수 없다
	final int C;
	
	public Test6() {
		System.out.println("생성자...");
		C = 100;
		System.out.println("C : " + C);
	}

	public static void main(String[] args) {

		Test6 ob = new Test6();
		Test6 ob1 = new Test6();
		
	}

}








