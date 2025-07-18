package com.day4;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cnt, qty=15800;
		double sum,sales;
				
		System.out.print("구입 수량을 입력하세요 : ");//12

		cnt = sc.nextInt();

		sum=cnt*qty;
		
		if(cnt >=30) 
			sales=cnt*qty*0.8;
		else if(cnt >=20)
			sales=cnt*qty*0.85;
		else if(cnt >=10)
			sales=cnt*qty*0.9;
		else
			sales=cnt*qty;

		System.out.println("구입수량 : " + cnt 
				+ "개, 판매총금액 : " + sum + "원, " 
				+"할인금액: " + sales +"원");
		
		
	}

}
