package com.day5;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {

		//1���� 100������ ���߿��� 3�� ����� ����
		
		//����
		Scanner sc = new Scanner(System.in);
		int i,cnt=0,su;
		
		//�Է�
		System.out.print("�� �Է�?");//50
		su = sc.nextInt();
		
		//����
		for(i=1;i<=su;i++) {
			
			if(i%3==0) {
				cnt++; //cnt=cnt+1
			}
			
		}
		
		System.out.println("1���� " + su 
				+ "���� 3�� ����� ����: " + cnt + "��");
		
		
	}

}





