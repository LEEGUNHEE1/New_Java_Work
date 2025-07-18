package com.day4;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		//반복문
		//for, while, do~while
		
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		System.out.print("단?");//7
		dan = sc.nextInt();
		
		//for(시작값;최대값;증가값){작업}
		for(int i=1;i<=9;i++) {	//i=i+1
			
			System.out.println(dan + "*" + i + "=" +(dan*i));
			
		}
		
		System.out.println("---------------------");
		
		//시작값
		//while(최대값){증가값; 작업}
		int j = 0;		
		while(j<9) {
			j++;	//j=j+1;
			//System.out.println(dan + "*" + j + "=" + (dan*j));	
			System.out.printf("%d*%d=%d\n",dan,j,(dan*j));
		}
		
		System.out.println("---------------------");
		
		//시작값
		//do{증가값; 작업}while(최대값);
		int k=0;
		do {
			k++;	//k=k+1;
			System.out.println(dan + "*" + k + "=" + (dan*k));
						
		}while(k<9);
		
		

	}

}
