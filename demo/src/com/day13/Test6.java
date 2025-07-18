package com.day13;

class TestB{
	public void print() {
		System.out.println("TestB 클래스..");
	}
}

class TestC{
	public void print() {
		System.out.println("TestC 클래스..");
	}
}

public class Test6 {

	public static void main(String[] args) {

		TestB ob1 = new TestB();
		TestC ob2;
		//클래스가 다르기 때문에 에러
		//클래스는 자료형이기 때문에 
		//자료형이 달라서 넣을수 없다
		//ob2 = ob1;
		
		
	}

}




