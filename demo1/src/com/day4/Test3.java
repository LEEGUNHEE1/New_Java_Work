package com.day4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		//세개의 수를 입력 받아 오름차순으로 정렬 하시오
		
		//선언
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,temp;
		
		//입력
		System.out.print("세개의 수?");//10 6 2
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		
		//연산
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
		
		
		//출력
		System.out.println(num1 + ":" + num2 + ":" + num3);
		
		
		
		
		
		
		
		
		
		
	}

}




