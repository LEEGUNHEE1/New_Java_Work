package com.day13;

//추상클래스
//메모리의 낭비가없이 클래스를 미리 설계
//메소드를 재정의 해서 사용한다
//추상메소드 1개가 반드시 있어야 한다
//일반 메소드도 만들수 있다

abstract class ShapeClass{
	
	abstract void draw();
	
	//일반 메소드도 사용 가능
	public void draw1() {		
	}
	
}

class Circ extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("원을 그린다...");
	}
	
}

class Rect extends ShapeClass{
	
	@Override
	public void draw() {
		System.out.println("사각형을 그린다...");
	}
	
}

class Tria extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("삼각형을 그린다...");
	}
	
}

public class Test4 {

	public static void main(String[] args) {
		
		Circ c = new Circ();
		Rect r = new Rect();
		Tria t = new Tria();
		
		c.draw();
		r.draw();
		t.draw();
		

	}

}








