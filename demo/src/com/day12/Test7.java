package com.day12;

import java.util.Calendar;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		int y,m,i,week;
		
		do {
			System.out.print("�⵵?");//2025
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("��?");//7
			m = sc.nextInt();
		}while(m<1||m>12);
		
		cal.set(y, m-1, 1);
		
		//1-7
		week = cal.get(Calendar.DAY_OF_WEEK);		
		
		System.out.printf("%13d�� %d��\n",y,m);
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("------------------------------");
		
		//Ư�� ���Ϻ��� ����ϵ��� ���� ����
		for(i=1;i<week;i++) {
			System.out.print("    ");//���� 4ĭ
		}
		
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		
		//�ش� ���� ��¥�� ���
		for(i=1;i<=lastDay;i++) {
			
			System.out.printf("%4d",i);
			
			week++;
			
			//����ϱ��� ���
			if(week%7==1) {
				System.out.println();
			}
			
		}//for..end
		
		//���߿� ������ ���
		if(week%7!=1) {
			System.out.println();
		}
		System.out.println("------------------------------");
		
		
		
	}

}


















