package com.day6;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//�迭
				
		int num[] = new int[5];
		
		System.out.println("�迭�� ����: " + num.length + "��");
		
		System.out.print("5���� ����?");//10 20 30 40 50		
		
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();			
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.println("num[" + i + "]: " + num[i]);
		}
		
		num[3] = 400;
		System.out.println("num[3]: " + num[3]);
		
		int a = num[4];
		System.out.println("a: " + a);
		
		
		
		
	}

}






























