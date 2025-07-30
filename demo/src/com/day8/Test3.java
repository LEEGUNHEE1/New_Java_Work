package com.day8;

public class Test3 {

	public static void main(String[] args) {
		
		Com ob = new Com();	
		
		ob.input();		
		int a = ob.area();
		int l = ob.length();		
		ob.print(a, l);
		
		
		System.out.println(a);
		System.out.println(l);
		//-----------------		
		
		Com ob1 = new Com();
		
		ob1.input(); 
		a = ob1.area();
		l = ob1.length();
		ob1.print(a, l);
		
		
		System.out.println(a);
		System.out.println(l);
		
		System.out.println(ob.w);
		System.out.println(ob.h);
		
		System.out.println(ob1.w);
		System.out.println(ob1.h);
		
		
		
	}

}










