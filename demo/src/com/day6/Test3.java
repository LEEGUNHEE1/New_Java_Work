package com.day6;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		//��,��,���� �Է��ϸ� ���� ���
		//2025�� 6�� 30�� ������
		
		Scanner sc =  new Scanner(System.in);
		
		//���� ��¥���� �迭�� ����
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int y,m,d,nalsu,i,week;
		
		do {
			System.out.print("�⵵?");//2025
			y = sc.nextInt();
		}while(y<1);
		
		//���⿡ ���� 2���� ���� ���
		if(y%4==0 && y%100!=0 || y%400==0) {
			months[1] = 29;
		}
		
		do {
			System.out.print("��?");//8
			m = sc.nextInt();
		}while(m<1||m>12);
		
		do {
			System.out.print("��?");//23
			d = sc.nextInt();
		}while(d<1||d>months[m-1]);
		
		
		
		//1��1��1�Ϻ��� ����(y-1)12��31�ϱ����� ����
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
				
		//y�� ����(m-1)������ ����
		//index :  0  1  2  3  4  5  6  7  8  9 10 11    
		//months:{31,28,31,30,31,30,31,31,30,31,30,31};
		//��    :  1  2  3  4  5  6  7  8  9 10 11 12
		for(i=0;i<m-1;i++) {
			nalsu += months[i];			
		}
		
		nalsu += d; //y��m��d���� ����
		
		week = nalsu % 7;//0~6
		
		//System.out.println(week);
		
		//2025�� 6�� 30�� ������
		
		String yoil[] = {"��","��","ȭ","��","��","��","��"};
		
		System.out.printf("%d�� %d�� %d�� %s����\n",
				y,m,d,yoil[week]);
		
		
		char yoil1[] = {'��','��','ȭ','��','��','��','��'};
		
		System.out.printf("%d�� %d�� %d�� %c����\n",
				y,m,d,yoil1[week]);	
		
		/*
		if(week==0) {
			System.out.println(y + "�� " + m + "�� " 
					+ d + "�� �Ͽ���");
		}else if(week==1) {
			System.out.printf("%d�� %d�� %d�� ������",
					y,m,d);
		}
		
		
		switch(week) {
		case 0:
			System.out.println(y + "�� " + m + "�� " 
					+ d + "�� �Ͽ���");
			break;
		case 1:
			System.out.printf("%d�� %d�� %d�� ������",
					y,m,d);
			break;
		}
		*/
		
		
		
		
		
		
	}

}





