package com.day11;

class Super {
	
	//public Super() {}
	
	public Super(int a) {
		
	}
	
}

class Child extends Super{
	
	public Child() {
		super(10);
		System.out.println();
		
	}
	
}

public class Test5 {

	public static void main(String[] args) {

		Child ob = new Child();
		
	}

}
