package com.day5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		//4개의 정수를 입력받아 제일 큰숫자와 제일 작은 숫자를 출력
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,num4,temp;
		
		System.out.print("4개의 정수를 입력?");//9 3 1 2
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
		/*
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
		
		if(num1>num4) {
			temp = num1;
			num1 = num4;
			num4 = temp;
		}
		
		if(num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		if(num2>num4) {
			temp = num2;
			num2 = num4;
			num4 = temp;
		}
		
		if(num3>num4) {
			temp = num3;
			num3 = num4;
			num4 = temp;
		}
		
		System.out.println(num1 + ":" + num4);
		
		*/
		
		int max,min;
		
		max=min=num1;
		
		//----------
		if(num1>max)
			max = num1;
		
		if(num1<min)
			min = num1;
		//-----------
		if(num2>max)
			max = num2;
		
		if(num2<min)
			min = num2;
		//-----------
		if(num3>max)
			max = num3;
		
		if(num3<min)
			min = num3;
		//-----------
		if(num4>max)
			max = num4;
		
		if(num4<min)
			min = num4;
		
		
		System.out.println(min + ":" + max);
		
		
		//제일 작은숫자:1, 제일 큰숫자:9
		
	}

}
