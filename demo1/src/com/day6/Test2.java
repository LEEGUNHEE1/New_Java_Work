package com.day6;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		//����޷�
		Scanner sc =  new Scanner(System.in);
		
		//���� ��¥���� �迭�� ����
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int y,m,nalsu,i,week;
		
		do {
			System.out.print("�⵵?");//2025
			y = sc.nextInt();
		}while(y<1||y>3000);
		
		do {
			System.out.print("��?");//8
			m = sc.nextInt();
		}while(m<1||m>12);
		
		//���⿡ ���� 2���� ���� ���
		if(y%4==0 && y%100!=0 || y%400==0) {
			months[1] = 29;
		}
		
		//1��1��1�Ϻ��� ����(y-1)12��31�ϱ����� ���� ���� ����
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		
		//int yy = (y-1)/4 - (y-1)/100 + (y-1)/400;
		//System.out.println(nalsu + ":" + yy);
		
		//y�� ����(m-1)������ ����
		//index :  0  1  2  3  4  5  6  7  8  9 10 11    
		//months:{31,28,31,30,31,30,31,31,30,31,30,31};
		//��    :  1  2  3  4  5  6  7  8  9 10 11 12
		for(i=0;i<m-1;i++) {
			nalsu += months[i];			
		}
		
		nalsu += 1; //y��m��1���� ����
		
		week = nalsu % 7;//0~6
		
		//System.out.println(week);
		
		
		System.out.printf("%13d�� %d��\n",y,m);
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("------------------------------");
		
		//Ư�� ���Ϻ��� ����ϵ��� ���� ����
		for(i=0;i<week;i++) {
			System.out.print("    ");//���� 4ĭ
		}
		
		//�ش� ���� ��¥�� ���
		for(i=1;i<=months[m-1];i++) {
			
			System.out.printf("%4d",i);
			
			week++;
			
			//����ϱ��� ���
			if(week%7==0) {
				System.out.println();
			}
			
		}//for..end
		
		//���߿� ������ ���
		if(week%7!=0) {
			System.out.println();
		}
		System.out.println("------------------------------");
		
	}

}





