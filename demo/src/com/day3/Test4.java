package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {
		
		//제어문 종류
		//조건문 : if, if~else, elseif
		//반목문 : for, while, do~while
		//switch 
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num=0;
		String str=""; //null
		
		System.out.print("수 입력? ");//10
		num = Integer.parseInt(br.readLine());
		
		/*
		//if(조건식){true일때 작업}
		if(num%2==0) {
			str = "짝수";
		}
		
		if(num%2!=0) {
			str = "홀수";
		}
		*/
		
		if(num%2==0) {
			str = "짝수";			
		}else {
			str = "홀수";
		}
			
				
		System.out.println(num + " : " + str);
		
		
		
		
		
		
		
		

	}

}



