package com.day8;

import java.util.Scanner;

public class Hap {
	
	int su;
	int sum;
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("���� �Է�?");//100
		su = sc.nextInt();		
		
	}
	

	public void cnt() {		
		
		for(int i=1;i<=su;i++) {
			sum += i;
		}		
			
	}
	
	public void print() {
		System.out.println("1~" + su + "������ ��: " + sum);
		
	}
	

}




















