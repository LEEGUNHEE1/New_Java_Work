package com.day5;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

		//두개의 수를 입력 받아 작은수에서 큰수까지의 합 구하기
		//두개의 수: 1 50
		//1에서 50까지의 합
		
		//두개의 수: 40 10
		//10에서 40까지의 합
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,sum=0;
		
		System.out.print("두개의 정수 입력?");
		num1 = sc.nextInt();//10
		num2 = sc.nextInt();//20
		
		/*
		//방법1
		if(num1>num2) {
			
			for(int i=num2;i<=num1;i++) {
				sum+=i;
			}
			
			System.out.println(num2 + "에서 " + num1 + 
					"까지의 합: " + sum);
		}else {
			
			for(int i=num1;i<=num2;i++) {
				sum+=i;
			}
			
			System.out.println(num1 + "에서 " + num2 + 
					"까지의 합: " + sum);
		}
		
		*/
		
		//방법2		
		if(num1>num2) {
			
			num1 = num1^num2;
			num2 = num1^num2;
			num1 = num1^num2;
			
		}		
		
		sum=0;
		for(int i=num1;i<=num2;i++) {
			sum+=i;
		}
		
		System.out.println(num1 + "에서 " + num2 + 
				"까지의 합: " + sum);
			
	}

}








