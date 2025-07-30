package com.day12;

import java.util.Calendar;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		
		/*
		�⵵? 2025
		��? 4
		��? 20
		������? 100

		�� �� �� : 2025�� 4�� 20�� �Ͽ���
		100�� �� : 2025�� 7�� 29�� ȭ����
		*/
		
		Scanner sc = new Scanner(System.in);

		Calendar now = Calendar.getInstance();

		String[] yoil = {"��","��","ȭ","��","��","��","��"};
						
		int y,m,d,i,w,nal;
		
		do{
			System.out.print("�⵵?");
			y = sc.nextInt();
		}while(y<1);
		
		do{
			System.out.print("��?");//2
			m = sc.nextInt();
		}while(m<1||m>12);
		
		now.set(y, m-1, 1);
		
		do{
			System.out.print("��?");
			d = sc.nextInt();			
		}while(d<1||d>now.getActualMaximum(Calendar.DATE));
				
		do{
			System.out.print("������?");
			nal = sc.nextInt();
		}while(nal<1);
		
		now.set(y, m-1, d);
		
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("������ : %d�� %d�� %d�� %s����\n",
				y,m,d,yoil[w-1]);
		
		now.add(Calendar.DATE, nal);		
		
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("%d�� �� : %d�� %d�� %d�� %s����\n",
				nal,y,m,d,yoil[w-1]);
		
		

	}

}
