package com.day2;

public class Test4 {

	public static void main(String[] args) {

		float f = 0;	//0.0
		double d = 0;	//0.0
			
		//System.out.println(f);
		
		for(int i=1;i<=10000;i++) {//i=i+1
			
			//System.out.println(i + ". 수지 만세!!");
			
			f+=100000;	//f = f + 100000;
			d+=100000;	//d = d + 100000;
			
		}
		
		//f: 10000000000
		//d: 10000000000
		System.out.println("float:" + (f/100000));
		System.out.println("double: " + (d/100000));
		
		
	}

}
