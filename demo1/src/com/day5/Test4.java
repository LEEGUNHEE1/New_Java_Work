package com.day5;

public class Test4 {

	public static void main(String[] args) {
		
		int i,sum;
		
		sum=0;
		
		//100������ ��
		for(i=1;i<=100;i++) {
			sum+=i; //sum=sum+i
		}
		
		
		
		//Ȧ���� ��
		sum=0;
		for(i=1;i<100;i+=2) {
			sum+=i;
		}
		
		
		//3�� ����� ��
		sum=0;
		for(i=3;i<100;i+=3) {
			sum+=i;
		}
		
		
		//100������ ��
		for(i=1,sum=0;i<=100;sum+=i,i++);
		
		
		System.out.println("���: " + sum);
		
		

	}

}




