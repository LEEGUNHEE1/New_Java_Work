package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num;
		
		System.out.print("�� �Է�? ");//5
		num = Integer.parseInt(br.readLine());
		
		String str1,str2,str3;
		
		//���׿�����
		//���ǹ�?"true��":"false��";
		str1 = num%2==0?"¦��":"Ȧ��";		
		System.out.println(num + " : " + str1);
		
		
		str2 = num>0?"���":(num<0?"����":"��");		
		System.out.println(num + " : " + str2);
		
		
		str3 = num%4==0 && num%100!=0 || num%400==0?"����":"���";
		System.out.println(num + " : " + str3);

		/*
		&& : AND (���ǽ� 2���� ��� TRUE�̸� TRUE�̴�)
		T && T : T
		T && F : F
		F && T : F
		F && F : F
		
		|| : OR (���ǽ� ���߿� �ϳ��� TRUE�̸� TRUE�̴�)
		T || T : T
		T || F : T
		F || T : T
		F || F : F
		
		
		
		
		*/
	}

}

























