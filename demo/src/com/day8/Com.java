package com.day8;

import java.util.Scanner;

public class Com {
	
	int w,h; //Instance 변수,전역변수
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		//int w,h;//지역변수
		
		System.out.print("가로?");//20
		w = sc.nextInt();
		
		System.out.print("세로?");//50
		h = sc.nextInt();
		
		//return;
	}
	
	public int area() {
		
		int result;//지역변수
		
		result = w*h;
		
		return result;
		
	}
	
	public int length() {
		
		return (w+h)*2;
		
	}
	
	public void print(int a, int l) {
		
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + a);
		System.out.println("둘레: " + l);
		
	}

}









