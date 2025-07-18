package com.day5;

import java.io.IOException;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		char op;
		
		System.out.print("첫번째 수?");//100
		num1 = sc.nextInt();
		
		System.out.print("두번째 수?");//30
		num2 = sc.nextInt();
		
		System.out.print("연산자[+,-,*,/]?");//+(43)
		op = (char)System.in.read();
		
		switch(op) {
		
		case '+':
			System.out.printf("%d + %d = %d",
					num1,num2,num1+num2);
			break;
		case '-':
			System.out.printf("%d - %d = %d",
					num1,num2,num1-num2);
			break;
		case '*':
			System.out.printf("%d * %d = %d",
					num1,num2,num1*num2);
			break;
		case '/':
			System.out.printf("%d / %d = %d",
					num1,num2,num1/num2);			
			break;
		
		
		}
		
		
		
	}

}





