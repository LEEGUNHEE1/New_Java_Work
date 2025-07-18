package com.day3;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor;
		
		System.out.print("이름?");//수지
		name = sc.next();
		
		System.out.print("국어?");//60
		kor = sc.nextInt();
		
		String pan;
		
		if(kor>=90) {
			pan="A";
		}else if(kor>=80) {
			pan="B";
		}else if(kor>=70) {
			pan="C";
		}else if(kor>=60) {
			pan="D";
		}else {
			pan="F";
		}
		
		System.out.println(name + " : " + pan + "등급");
		
		
		

	}

}
