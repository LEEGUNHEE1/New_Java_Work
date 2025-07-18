package com.day13;

class Test{
	
	protected int a=10,b=20;
			
	public void write() {
		System.out.println("SuperClass write()...");
		System.out.println("a: " + a + ",b: " + b);//10,20
		//System.out.println(c);
	}
	
}

class Demo extends Test{
	
	protected int b=30,c=40;
	
	@Override
	public void write() {
		System.out.println("SubClass write()...");
		System.out.println("a: " + a + ",b: " + b + ",c: " + c);
		System.out.println("super.b: " + super.b);
	}
	
	public void print1() {
		System.out.println("SubClass print1()...");
		write();
	}
	
	public void print2() {
		System.out.println("SubClass print2()...");
		super.write();
	}	
	
}

public class Test1 {

	public static void main(String[] args) {

		Demo ob = new Demo();
		
		ob.write();
		System.out.println("--------");
		ob.print1();
		System.out.println("--------");
		ob.print2();
		System.out.println("--------");
		
		System.out.println("ob.b: " + ob.b);//30
		//upcast
		System.out.println("((Test)ob).b: " + ((Test)ob).b);//20
		
		//upcast
		//메소드는 변수와 다르게 자신의 메소드를 사용하게 한다
		//메소드는 heap영역이아닌 메소드 영역에있기때문에
		//접근이 불가하다
		((Test)ob).write();
		
		/*
		int a = 10;
		double b;
		
		b = a; 			암시적형변환(O)
		b = (double)a; 	명시적 형변환(O)
		
		a = b;		(X)
		a = (int)b	(O)
		-----------------------------------
		부모(d) - 자식(i)
		
		부모 = 자식;		upcast(O)
		부모 = (부모)자식;	upcast(O)
		
		자식 = 부모	(X)
		자식 = (자식)부모 (O)	downcast
		
		
		
		
		*/
		
		
	}

}
