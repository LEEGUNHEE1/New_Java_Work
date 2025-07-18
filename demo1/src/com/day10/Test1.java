package com.day10;

//static
//객체가 100개 생성되도 메모리 공간은 1개만 사용
//객체를 생성하지 않아도 메모리상에 올라가 있다

public class Test1 {
	
	public static int a = 10; //Class변수	
	//클래스변수,또는 클래스 메소드는 로딩되는 순간
	//메모리 할당이 이루어지며 [클래스이름.객체]으로 
	//접근 가능하다 즉,new를 통해 메모리 할당을 받지 않아도 
	//사용이 가능하다
	
	private int b = 20; //Instance 변수
	//인스턴스 변수 또는 인스턴스 메소드는 new를 통해 객체를
	//생성하고 객체를 통해서만 접근이 가능하다
	//인스턴스 변수는 같은 클래스의 메소드에서는 바로 
	//접근이 가능하지만 클래스 메소드에서는 접근할수 없다

	public void write() {//Instance 메소드
		
		System.out.println("class 변수 a :" + a);
		System.out.println("instance 변수 b: " + b);		
		
	}
	
	public static void print() {//class 메소드
		
		System.out.println("class 변수 a :" + a);
		//System.out.println("instance 변수 b: " + b);
		
	}

	public static void main(String[] args) {

		System.out.println("class변수 a : " + a);
		System.out.println("class변수 a : " + Test1.a);
		
		//System.out.println(b);
		//write();
		
		print();
		Test1.print();
		
		Test1 ob = new Test1();
		
		System.out.println(ob.b);
		ob.write();
		
		System.out.println(ob.a);
		ob.print();
		
		System.out.println("-------------------");
		
		Test1 ob1 = new Test1();
		ob1.a = 100;
		ob1.b = 200;
		
		ob1.write();
		
		ob.write();
		
		Test1 ob2 = new Test1();
		
		ob2.a = 300;
		ob2.b = 50;
		
		ob.write();
		ob1.write();
		ob2.write();
		
	}

}



























