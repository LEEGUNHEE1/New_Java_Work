package com.day5;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		//�ΰ��� ������ �Է¹޾� ū���ڿ� ���� ���ڸ� �����ؼ� ���
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.print("�ΰ��� ���� �Է�?");//10 20
		num1 = sc.nextInt();//10
		num2 = sc.nextInt();//20
		
		if(num1>num2) {
			System.out.println("ū ����: " + num1 
					+ ", ���� ����: " + num2);
		}else {
			System.out.println("ū ����: " + num2 
					+ ", ���� ����: " + num1);
		}
		
		
		//ū ����: 20, ���� ����: 10
		

	}

}
