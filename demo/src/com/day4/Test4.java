package com.day4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		//3의 배수인지 4의 배수인지 확인
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		String str;
		
		System.out.print("수 입력?");//12
		num = sc.nextInt();
		
		if(num%3==0 && num%4==0) {
			str = "3과 4의 배수입니다";
		}else if(num%4==0) {
			str = "4의 배수 입니다";			
		}else if(num%3==0) {
			str = "3의 배수입니다";		
		}else {
			str = "3과 4의 배수가 아닙니다";
		}
				
		System.out.println(num + " : " + str);
		
		
		
		
		
		

	}

}
