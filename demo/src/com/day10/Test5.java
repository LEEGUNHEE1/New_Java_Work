package com.day10;


class RectA{
	
	private int w,h;
	
	public RectA() {}
	
	public RectA(int w, int h) {//오버로딩된 생성자
		this.w = w;
		this.h = h;
	}	
	
	public void setData(int w,int h) {//변수 초기화 메소드
		this.w = w;
		this.h = h;
	}
	
	public int area() {
		return w*h;
	}
	
	public int length() {
		return (w+h)*2;
	}
	
	public void print() {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
	}
	
	//오버로딩된 메소드
	public void print(int a, int l) {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + a);
		System.out.println("둘레: " + l);
	}
	
}


public class Test5 {

	public static void main(String[] args) {

				
		RectA ob = new RectA();//기본 생성자
		ob.setData(10, 20);
		int a = ob.area();
		int l = ob.length();
		ob.print();
		ob.print(a, l);
		
		System.out.println("-------------");
		
		RectA ob1 = new RectA(100, 200);//오버로딩된 생성자
		a = ob1.area();
		l = ob1.length();
		ob1.print();
		ob1.print(a, l);
		
		ob1.setData(11, 22);
		a = ob1.area();
		l = ob1.length();
		ob1.print();
		ob1.print(a, l);
		
		
		
		
	}

}




























