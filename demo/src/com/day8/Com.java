package com.day8;

import java.util.Scanner;

public class Com {
	
	int w,h; //Instance ����,��������
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		//int w,h;//��������
		
		System.out.print("����?");//20
		w = sc.nextInt();
		
		System.out.print("����?");//50
		h = sc.nextInt();
		
		//return;
	}
	
	public int area() {
		
		int result;//��������
		
		result = w*h;
		
		return result;
		
	}
	
	public int length() {
		
		return (w+h)*2;
		
	}
	
	public void print(int a, int l) {
		
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: " + a);
		System.out.println("�ѷ�: " + l);
		
	}

}









