package com.day4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		//3�� ������� 4�� ������� Ȯ��
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		String str;
		
		System.out.print("�� �Է�?");//12
		num = sc.nextInt();
		
		if(num%3==0 && num%4==0) {
			str = "3�� 4�� ����Դϴ�";
		}else if(num%4==0) {
			str = "4�� ��� �Դϴ�";			
		}else if(num%3==0) {
			str = "3�� ����Դϴ�";		
		}else {
			str = "3�� 4�� ����� �ƴմϴ�";
		}
				
		System.out.println(num + " : " + str);
		
		
		
		
		
		

	}

}
