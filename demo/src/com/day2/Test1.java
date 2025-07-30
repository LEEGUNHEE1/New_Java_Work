package com.day2;

public class Test1 {

	public static void main(String[] args) {

		int r = 10;
		float area,length;
		
		area = r*r*3.14f;//넓이
		length = r*2*3.14f;//둘레
		
		System.out.println("반지름: " + r + ", 넓이: " + area);
		System.out.printf("반지름: %d, 넓이: %.2f\n",r,area);
		System.out.printf("반지름: %d, 넓이: %g\n",r,area);
		
		
		int a = 10;
		float b = 6; // 자동 형변환
		
		
		System.out.println(a + ":" + b);
		
		a = (int)b;
		
		System.out.println(a + ":" + b);
		
		
		
		
		
		
		
	}

}
