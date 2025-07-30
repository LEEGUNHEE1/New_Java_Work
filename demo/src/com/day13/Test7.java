package com.day13;

//Interface
//추상클래스의 일종으로 선언만있고 정의가없다
//final변수만 선언할수있다
//인터페이스를 구현하기위해서는 implements를 사용한다
//하나이상의 인터페이스를 구현한 클래스는 모든 메소드를
//재정의 해야한다
//인터페이스가 인터페이스를 상속 받을수있으며 이때는
//extends를 사용한다
//클래스와는 다르게 다중 구현이 가능하다

interface Fruit{
	
	String Won = "원"; //public static final생략
	
	int getPrice();		//public abstract
	public String getName();
	
}

class FruitImpl implements Fruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "사과";
	}
	
	
	public String getItem() {
		return "과일";
	}
	
}

public class Test7{

	public static void main(String[] args) {
		
		FruitImpl ob1 = new FruitImpl();//upcast로 객체를 생성
		
		System.out.println(ob1.getItem());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1; //upcast
		
		System.out.println(ob2.getName());//사과
		
		//4.자식꺼는 자식꺼다
		//System.out.println(ob2.getItem());
		

	}

}




















