package com.day11;

//생성자
class TestC{
	
	private String title;//사각형
	protected int area;//200
	
	public TestC(String title) {//오버로딩된 생성자
		this.title = title;
	}
	
	public void print() {
		System.out.println(title + " : " + area);
	}
	
}

class RectC extends TestC{
	
	private int w,h;
	
	public RectC(int w, int h) {
		super("사각형");
		this.w = w;
		this.h = h;
		
	}
	
	public void rectArea() {
		area = w*h;
	}	
	
}

public class Test4 {

	public static void main(String[] args) {
		
		RectC ob = new RectC(10, 20);
		ob.rectArea();
		ob.print();

	}

}




