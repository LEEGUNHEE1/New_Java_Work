package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num;
		
		System.out.print("수 입력? ");//5
		num = Integer.parseInt(br.readLine());
		
		String str1,str2,str3;
		
		//삼항연산자
		//조건문?"true값":"false값";
		str1 = num%2==0?"짝수":"홀수";		
		System.out.println(num + " : " + str1);
		
		
		str2 = num>0?"양수":(num<0?"음수":"영");		
		System.out.println(num + " : " + str2);
		
		
		str3 = num%4==0 && num%100!=0 || num%400==0?"윤년":"평년";
		System.out.println(num + " : " + str3);

		/*
		&& : AND (조건식 2개가 모두 TRUE이면 TRUE이다)
		T && T : T
		T && F : F
		F && T : F
		F && F : F
		
		|| : OR (조건식 둘중에 하나가 TRUE이면 TRUE이다)
		T || T : T
		T || F : T
		F || T : T
		F || F : F
		
		
		
		
		*/
	}

}

























