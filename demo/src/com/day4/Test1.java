package com.day4;

import java.util.Scanner;

//Scanner
//단락문자의 패턴을 사용해 분류하는 작업
//기본 패턴은 공백
public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor,eng,mat;
		
		System.out.print("이름 국어 영어 수학?");//수지 50 60 70
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		System.out.println("이름: " + name + " : " 
				+ "총점: " + (kor+eng+mat) + "점");
		
		
		
	}

}



