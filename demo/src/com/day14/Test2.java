package com.day14;

//내부클래스(Local)
//메소드안에 클래스를 만들수있다
class Outer2{
	
	static int a  =10;
	int b = 20;
	
	public void write() {
		
		int c = 30;
		final int d = 40;
		
		class Inner2{
			
			public void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}
			
		}
		
		Inner2 in = new Inner2();
		in.print();
		
	}//end..write()	
	
}

public class Test2 {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		out.write();

	}

}




