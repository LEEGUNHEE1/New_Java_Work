package com.day8;

class Test{
	
	int a,b;
	
}

public class Test4 {

	public static void main(String[] args) {

		Test ob1 = new Test();
		Test ob2 = new Test();
		
		ob1.a = 10;
		ob1.b = 20;		
		System.out.println(ob1.a);//10
		System.out.println(ob1.b);//20
		
		ob2.a = 100;
		ob2.b = 200;
		System.out.println(ob2.a);//100
		System.out.println(ob2.b);//200	
		
		System.out.println(ob1.a);//10
		System.out.println(ob1.b);//20
		
	}

}


