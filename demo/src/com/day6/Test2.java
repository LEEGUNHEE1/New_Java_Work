package com.day6;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		//만년달력
		Scanner sc =  new Scanner(System.in);
		
		//월별 날짜수를 배열에 저장
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int y,m,nalsu,i,week;
		
		do {
			System.out.print("년도?");//2025
			y = sc.nextInt();
		}while(y<1||y>3000);
		
		do {
			System.out.print("월?");//8
			m = sc.nextInt();
		}while(m<1||m>12);
		
		//윤년에 따른 2월의 날수 계산
		if(y%4==0 && y%100!=0 || y%400==0) {
			months[1] = 29;
		}
		
		//1년1월1일부터 전년(y-1)12월31일까지의 윤년 포함 날수
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		
		//int yy = (y-1)/4 - (y-1)/100 + (y-1)/400;
		//System.out.println(nalsu + ":" + yy);
		
		//y년 전월(m-1)까지의 날수
		//index :  0  1  2  3  4  5  6  7  8  9 10 11    
		//months:{31,28,31,30,31,30,31,31,30,31,30,31};
		//월    :  1  2  3  4  5  6  7  8  9 10 11 12
		for(i=0;i<m-1;i++) {
			nalsu += months[i];			
		}
		
		nalsu += 1; //y년m월1일의 날수
		
		week = nalsu % 7;//0~6
		
		//System.out.println(week);
		
		
		System.out.printf("%13d년 %d월\n",y,m);
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("------------------------------");
		
		//특정 요일부터 출발하도록 공백 지정
		for(i=0;i<week;i++) {
			System.out.print("    ");//공백 4칸
		}
		
		//해당 월의 날짜를 출력
		for(i=1;i<=months[m-1];i++) {
			
			System.out.printf("%4d",i);
			
			week++;
			
			//토요일까지 출력
			if(week%7==0) {
				System.out.println();
			}
			
		}//for..end
		
		//주중에 말일을 출력
		if(week%7!=0) {
			System.out.println();
		}
		System.out.println("------------------------------");
		
	}

}





