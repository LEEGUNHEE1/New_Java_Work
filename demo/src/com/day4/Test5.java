package com.day4;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		//�ݺ���
		//for, while, do~while
		
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		System.out.print("��?");//7
		dan = sc.nextInt();
		
		//for(���۰�;�ִ밪;������){�۾�}
		for(int i=1;i<=9;i++) {	//i=i+1
			
			System.out.println(dan + "*" + i + "=" +(dan*i));
			
		}
		
		System.out.println("---------------------");
		
		//���۰�
		//while(�ִ밪){������; �۾�}
		int j = 0;		
		while(j<9) {
			j++;	//j=j+1;
			//System.out.println(dan + "*" + j + "=" + (dan*j));	
			System.out.printf("%d*%d=%d\n",dan,j,(dan*j));
		}
		
		System.out.println("---------------------");
		
		//���۰�
		//do{������; �۾�}while(�ִ밪);
		int k=0;
		do {
			k++;	//k=k+1;
			System.out.println(dan + "*" + k + "=" + (dan*k));
						
		}while(k<9);
		
		

	}

}
