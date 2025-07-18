package com.day10;

class Rect{

	private int w,h;
	
	public void setData(int w,int h) {
		this.w = w;
		this.h = h;
	}
	
	public int area() {
		return w*h;
	}
	
	public int length() {
		return (w+h)*2;
	}
	
	public void print(int a, int l) {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + a);
		System.out.println("둘레: " + l);		
	}
	
	//메소드 중복정의(overloading)
	//하나의 클래스 안에서 
	//메소드의 이름을 통일시키는 작업
	//인수의 갯수가 다르거나 자료형이 다르면
	//다른 메소드로 인식을 한다
	public void print() {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
	}
	
	public void print(int a) {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + a);
	}
	
	public void print(double l) {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("둘레: " + l);
	}

}


public class Test3 {

	public static void main(String[] args) {

		Rect ob = new Rect();
		
		ob.setData(10, 20);
		int a = ob.area();
		int l = ob.length();
		
		ob.print(l);
		ob.print();
		ob.print(a);
		ob.print(a, l);
		
		
	}

}














