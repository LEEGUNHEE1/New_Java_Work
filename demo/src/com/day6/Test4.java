package com.day6;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int i,j,temp;
		
		
		System.out.print("5개의 정수?");//9 8 7 6 5
		for(i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}		
		
		System.out.print("Sourse Data: ");
		
		for(i=0;i<num.length;i++) {
			System.out.printf("%4d",num[i]);
		}
		System.out.println();
		
		//Selection Sort
		for(i=0;i<num.length-1;i++) {
			
			for(j=i+1;j<num.length;j++) {
				
				//System.out.println(i + ":" + j);
				
				if(num[i]>num[j]) {
				
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					
				}				
				
			}
			
		}
		
		//출력
		System.out.print("Sorted Data: ");
		
		for(int su : num) {//확장for문
			System.out.printf("%4d",su);
		}
		System.out.println();
		
		
		

	}

}
