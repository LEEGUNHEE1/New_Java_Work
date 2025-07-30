package com.day12;

//Wrapper 클래스

//자료형
//boolean,byte,char,short,int,long,float,double

//레퍼런스 데이터형
//Boolean,Byte,Character,Short,Integer,Long,Float,Double

//자료형(stack) -> 레퍼런스(heap) : Auto-Boxing
//레퍼런스(heap) -> 자료형(stack) : Auto-UnBoxing

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











