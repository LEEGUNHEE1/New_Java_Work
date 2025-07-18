package com.day7;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		//Bubble Sort
		
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		int i,j,temp;
		
		System.out.print("5개의 정수?");
		
		for(i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.print("Source Data: ");
		for(i=0;i<num.length;i++) {
			System.out.printf("%4d",num[i]);
		}
		System.out.println();
		
		//Bubble Sort
		for(i=1;i<num.length;i++) {
			for(j=0;j<num.length-i;j++) {
				
				//System.out.println(i + ":" + j);
				
				if(num[j]>num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}				
				
			}		
		}
		
		//출력
		System.out.print("Sorted Data: ");
		for(int su : num) {
			System.out.printf("%4d",su);
		}
		System.out.println();
		
		
		
		
		
	}

}




























