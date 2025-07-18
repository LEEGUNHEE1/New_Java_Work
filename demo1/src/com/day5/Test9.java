package com.day5;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {

		//1에서 100까지의 수중에서 3의 배수의 갯수
		
		//선언
		Scanner sc = new Scanner(System.in);
		int i,cnt=0,su;
		
		//입력
		System.out.print("수 입력?");//50
		su = sc.nextInt();
		
		//연산
		for(i=1;i<=su;i++) {
			
			if(i%3==0) {
				cnt++; //cnt=cnt+1
			}
			
		}
		
		System.out.println("1부터 " + su 
				+ "까지 3의 배수의 갯수: " + cnt + "개");
		
		
	}

}





