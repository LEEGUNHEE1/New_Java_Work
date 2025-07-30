package com.day11;

//모든 클래스는 Object를 상속 받는다
class SuperTestA{
	
	private int a = 10;
	
	public void write() {
		System.out.println("a: " + a);
	}
	
}

public class Test7 {

	public static void main(String[] args) {

		SuperTestA ob1 = new SuperTestA();
		SuperTestA ob2 = new SuperTestA();
		
		//==와 equals는 클래스의 주소를 비교
		System.out.println("ob1==ob2: " + (ob1==ob2));//false
		System.out.println("ob1.equals(ob2): " +
				ob1.equals(ob2));//false
		
		//HashCode
		System.out.println("ob1: " + ob1);//@51521cc1
		System.out.println("ob2: " + ob2);//@1b4fb997
		System.out.println("ob2.toString(); " + 
		ob2.toString());//@1b4fb997
		
		
		char ch = 'a';//97
		System.out.println(ch);//a
		System.out.println(Integer.toString(ch));//97
		
		
		
	}

}










