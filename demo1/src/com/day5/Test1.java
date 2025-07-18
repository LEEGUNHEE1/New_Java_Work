package com.day5;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		//두개의 정수를 입력받아 큰숫자와 작은 숫자를 구분해서 출력
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.print("두개의 정수 입력?");//10 20
		num1 = sc.nextInt();//10
		num2 = sc.nextInt();//20
		
		if(num1>num2) {
			System.out.println("큰 숫자: " + num1 
					+ ", 작은 숫자: " + num2);
		}else {
			System.out.println("큰 숫자: " + num2 
					+ ", 작은 숫자: " + num1);
		}
		
		
		//큰 숫자: 20, 작은 숫자: 10
		

	}

}
