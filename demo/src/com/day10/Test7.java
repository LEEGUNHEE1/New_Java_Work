package com.day10;

import java.io.IOException;
import java.util.Scanner;

//boolean 사용 방법
class Calc{
	
	private int num1,num2;
	private char oper;
	
	public boolean input() throws IOException {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("두개의 수?");//10 3
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.print("연산자?");//+-*/ 
		oper = (char)System.in.read();
		
		if(oper!='+'&&oper!='-'&&oper!='*'&oper!='/') {
			return false;
		}
		
		return true;
		
	}	
	
	public int result() {
		
		int sum = 0;
		
		switch(oper) {
			case '+': sum = num1+num2; break;
			case '-': sum = num1-num2; break;
			case '*': sum = num1*num2; break;
			case '/': sum = num1/num2; break;		
		}
		
		return sum;		
	}
	
	public void print(int sum) {
		System.out.printf("%d %c %d = %d",num1,oper,num2,sum);
	}
	
}

public class Test7 {

	public static void main(String[] args) throws IOException {

		Calc ob = new Calc();
						
		boolean a = ob.input(); 
		
		if(!ob.input()) {
			System.out.println("연산자 오류!!");
			return;			
		}
		
		int sum = ob.result();
		ob.print(sum);
		
		
		
	}

}









