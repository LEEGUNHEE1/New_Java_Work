package com.day4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		//������ ���� �Է� �޾� ������������ ���� �Ͻÿ�
		
		//����
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,temp;
		
		//�Է�
		System.out.print("������ ��?");//10 6 2
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		
		//����
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if(num1>num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		
		if(num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		
		//���
		System.out.println(num1 + ":" + num2 + ":" + num3);
		
		
		
		
		
		
		
		
		
		
	}

}




