package com.day6;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		//년,월,일을 입력하면 요일 출력
		//2025년 6월 30일 월요일
		
		Scanner sc =  new Scanner(System.in);
		
		//월별 날짜수를 배열에 저장
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int y,m,d,nalsu,i,week;
		
		do {
			System.out.print("년도?");//2025
			y = sc.nextInt();
		}while(y<1);
		
		//윤년에 따른 2월의 날수 계산
		if(y%4==0 && y%100!=0 || y%400==0) {
			months[1] = 29;
		}
		
		do {
			System.out.print("월?");//8
			m = sc.nextInt();
		}while(m<1||m>12);
		
		do {
			System.out.print("일?");//23
			d = sc.nextInt();
		}while(d<1||d>months[m-1]);
		
		
		
		//1년1월1일부터 전년(y-1)12월31일까지의 날수
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
				
		//y년 전월(m-1)까지의 날수
		//index :  0  1  2  3  4  5  6  7  8  9 10 11    
		//months:{31,28,31,30,31,30,31,31,30,31,30,31};
		//월    :  1  2  3  4  5  6  7  8  9 10 11 12
		for(i=0;i<m-1;i++) {
			nalsu += months[i];			
		}
		
		nalsu += d; //y년m월d일의 날수
		
		week = nalsu % 7;//0~6
		
		//System.out.println(week);
		
		//2025년 6월 30일 월요일
		
		String yoil[] = {"일","월","화","수","목","금","토"};
		
		System.out.printf("%d년 %d월 %d일 %s요일\n",
				y,m,d,yoil[week]);
		
		
		char yoil1[] = {'일','월','화','수','목','금','토'};
		
		System.out.printf("%d년 %d월 %d일 %c요일\n",
				y,m,d,yoil1[week]);	
		
		/*
		if(week==0) {
			System.out.println(y + "년 " + m + "월 " 
					+ d + "일 일요일");
		}else if(week==1) {
			System.out.printf("%d년 %d월 %d일 월요일",
					y,m,d);
		}
		
		
		switch(week) {
		case 0:
			System.out.println(y + "년 " + m + "월 " 
					+ d + "일 일요일");
			break;
		case 1:
			System.out.printf("%d년 %d월 %d일 월요일",
					y,m,d);
			break;
		}
		*/
		
		
		
		
		
		
	}

}





