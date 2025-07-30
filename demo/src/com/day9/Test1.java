package com.day9;

//this : 클래스 자기 자신(ME) 

class Circle{	
	
	private int r;//정보의 은닉(캡슐)화
		
	public void setData(int r) {//setData(int r,Circle this)
		this.r = r;		
	}
	
	public double area() {	//area(Circle this)	
		return this.r*this.r*3.14;
	}
	
	public double length() {	//length(Circle this)
		return this.r*2*3.14;
	}
	
	public void write(double a, double l) {
		System.out.println("반지름: " + this.r);
		System.out.println("넓이: " + a);
		System.out.println("둘레: " + l);
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Circle ob = new Circle();
		
		//ob.r = 10;
		
		ob.setData(10);//ob.setData(10,ob)
		
		double a = ob.area();//ob.area(ob)
		double l = ob.length();//ob.length(ob)
		ob.write(a, l);
		
		
	}

}
