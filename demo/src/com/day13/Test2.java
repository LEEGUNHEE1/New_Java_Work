package com.day13;

//Singleton
//static 사용
//객체를 계속 생성하는것이 아니라
//하나의 객체만 생성해서 사용하는 방법

class Sing{
	
	private static Sing ob;
	
	public static Sing getInstance() {
		
		if(ob==null) {
			ob = new Sing();
		}
		
		return ob;
	}
}
public class Test2 {

	public static void main(String[] args) {

		Sing ob1 = Sing.getInstance();
		Sing ob2 = Sing.getInstance();
		
		if(ob1==ob2) {
			System.out.println("동일한 객체...");
		}
		
		
		
		
		
		
	}

}
