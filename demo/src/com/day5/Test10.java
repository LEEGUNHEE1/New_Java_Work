package com.day5;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

		//�ΰ��� ���� �Է� �޾� ���������� ū�������� �� ���ϱ�
		//�ΰ��� ��: 1 50
		//1���� 50������ ��
		
		//�ΰ��� ��: 40 10
		//10���� 40������ ��
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,sum=0;
		
		System.out.print("�ΰ��� ���� �Է�?");
		num1 = sc.nextInt();//10
		num2 = sc.nextInt();//20
		
		/*
		//���1
		if(num1>num2) {
			
			for(int i=num2;i<=num1;i++) {
				sum+=i;
			}
			
			System.out.println(num2 + "���� " + num1 + 
					"������ ��: " + sum);
		}else {
			
			for(int i=num1;i<=num2;i++) {
				sum+=i;
			}
			
			System.out.println(num1 + "���� " + num2 + 
					"������ ��: " + sum);
		}
		
		*/
		
		//���2		
		if(num1>num2) {
			
			num1 = num1^num2;
			num2 = num1^num2;
			num1 = num1^num2;
			
		}		
		
		sum=0;
		for(int i=num1;i<=num2;i++) {
			sum+=i;
		}
		
		System.out.println(num1 + "���� " + num2 + 
				"������ ��: " + sum);
			
	}

}








