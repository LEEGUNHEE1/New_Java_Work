package com.day12;

import java.util.Calendar;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		int y,m,i,week;
		
		do {
			System.out.print("년도?");//2025
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("월?");//7
			m = sc.nextInt();
		}while(m<1||m>12);
		
		cal.set(y, m-1, 1);
		
		//1-7
		week = cal.get(Calendar.DAY_OF_WEEK);		
		
		System.out.printf("%13d년 %d월\n",y,m);
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("------------------------------");
		
		//특정 요일부터 출발하도록 공백 지정
		for(i=1;i<week;i++) {
			System.out.print("    ");//공백 4칸
		}
		
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		
		//해당 월의 날짜를 출력
		for(i=1;i<=lastDay;i++) {
			
			System.out.printf("%4d",i);
			
			week++;
			
			//토요일까지 출력
			if(week%7==1) {
				System.out.println();
			}
			
		}//for..end
		
		//주중에 말일을 출력
		if(week%7!=1) {
			System.out.println();
		}
		System.out.println("------------------------------");
		
		
		
	}

}


















