package com.day14;

//내부클래스(중첩)
//클래스안에 static 클래스를 만들수 있다
class Outer3{
	
	static int a = 10;
	int b = 20;
	
	public static class Inner3{
		
		int c = 30;
		
		public void write() {
			System.out.println(a);
			//System.out.println(b);
			System.out.println(c);
			
		}
		
	}
	
	public void print() {
		Inner3 in = new Inner3();
		in.write();
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		Outer3 out = new Outer3();
		out.print();
	}

}






