package com.day12;

import java.util.Calendar;

public class Test6 {

	public static void main(String[] args) {

		//Calendar
		
		Calendar now = Calendar.getInstance();
		
		int y = now.get(Calendar.YEAR);//년
		int m = now.get(Calendar.MONTH)+1;//월(0-11)
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK);//요일(1-7:일요일:1)
		
		String[] yoil = {"일","월","화","수","목","금","토"};
		
		System.out.printf("%d년 %d월 %d일 %s요일\n",
				y,m,d,yoil[w-1]);
		
		int startDay = now.getActualMinimum(Calendar.DATE);
		int endDay = now.getActualMaximum(Calendar.DATE);
		
		System.out.println(startDay + " : " + endDay);
		
		System.out.printf("%tF\n",now);
		System.out.printf("%tT\n",now);
		
		System.out.printf("%1$tF %1$tT\n",now);
		
		
		now.set(2026, 10-1, 10);
		
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("%d년 %d월 %d일 %s요일\n",
				y,m,d,yoil[w-1]);
		
	}

}




