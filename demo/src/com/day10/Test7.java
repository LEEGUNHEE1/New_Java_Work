package com.day10;

import java.io.IOException;
import java.util.Scanner;

//boolean ��� ���
class Calc{
	
	private int num1,num2;
	private char oper;
	
	public boolean input() throws IOException {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("�ΰ��� ��?");//10 3
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.print("������?");//+-*/ 
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
			System.out.println("������ ����!!");
			return;			
		}
		
		int sum = ob.result();
		ob.print(sum);
		
		
		
	}

}









