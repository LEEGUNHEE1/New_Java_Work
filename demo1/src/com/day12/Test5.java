package com.day12;

//Wrapper Ŭ����

//�ڷ���
//boolean,byte,char,short,int,long,float,double

//���۷��� ��������
//Boolean,Byte,Character,Short,Integer,Long,Float,Double

//�ڷ���(stack) -> ���۷���(heap) : Auto-Boxing
//���۷���(heap) -> �ڷ���(stack) : Auto-UnBoxing

public class Test5 {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2;
		
		Integer num1;
		Integer num2 = new Integer(20);
		
		num1 = n1;//Auto-Boxing
		n2 = num2;//Auto-UnBoxing
		
		System.out.println(n1 + " : " + num1);//10
		System.out.println(n2 + " : " + num2);//20
		

	}

}











