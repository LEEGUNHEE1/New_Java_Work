package com.day11;

class SuperTest{
	
	private String title;//원
	protected double area;//314.....200
	
	public SuperTest() {}
	
	public SuperTest(String title) {
		this.title = title;
	}
	
	public void write() {
		System.out.println(title + ":" + area);
	}
	
}

class Circle extends SuperTest{
		
	private int r;//10
	protected static final double PI = 3.14;
	
	public Circle(int r) {
		super("원");//부모의 오버로딩된 생성자 찾아감
		this.r = r;
	}
	
	public void circleArea() {
		area = r*r*PI;
	}
	
}

class Rec extends SuperTest{
	
	private int w,h;//10,20
	
	public void rectArea(int w, int h) {
		this.w = w;
		this.h = h;
		
		area = this.w*this.h;//200
	}

	//메소드 Override
	//상속관계에서 하는일이 비슷한 메소드의 이름을 
	//통일시키는 작업 
	@Override //annotation
	public void write() {
		System.out.println("가로:" + w);
		System.out.println("세로:" + h);
		System.out.println("면적:" + area);
	}
	
}


public class Test6 {

	public static void main(String[] args) {
		
		Circle ob1 = new Circle(10);
		ob1.circleArea();
		ob1.write();
		
		Rec ob2 = new Rec();
		ob2.rectArea(10, 20);
		ob2.write();
		
		//5. 부모와 자식이 같은 객체를 가지고 있으면
		//   내꺼를 사용한다

	}

}









