package com.day14;

//1.내부클래스(Inner)
//클래스안에 클래스를 만들수 있다
class Outer1{
	
	static int a = 10;
	int b = 20;
	
	//Nested Class
	public class Inner1{
		
		int c = 30;
		
		public void write() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
	}
	
	public void print() {
		Inner1 ob = new Inner1();
		ob.write();
	}	
}

public class Test1 {

	public static void main(String[] args) {
		
		//외부클래스 객체가 생성되어야
		//내부클래스 객체가 생성 할수있다
		//외부클래스 객체가 생성됐다고해서
		//내부클래스 객체가 생성된것은 아니다
		Outer1 out = new Outer1();
		out.print();
		
		Outer1.Inner1 in = out.new Inner1();
		in.write();

	}

}






