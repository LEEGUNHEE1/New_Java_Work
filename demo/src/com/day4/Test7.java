package com.day4;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cnt, qty=15800;
		double sum,sales;
				
		System.out.print("���� ������ �Է��ϼ��� : ");//12

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

		System.out.println("���Լ��� : " + cnt 
				+ "��, �Ǹ��ѱݾ� : " + sum + "��, " 
				+"���αݾ�: " + sales +"��");
		
		
	}

}
