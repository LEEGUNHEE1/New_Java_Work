package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {

	public static void main(String[] args) throws IOException {

		//사용자에게 이름,국어,영어점수를 입력받아
		//이름과 총점을 출력
		
		//선언
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		String name;//이름
		int kor,eng;
		int tot;
		
		
		//입력
		System.out.print("이름?");//suzi
		name = br.readLine();
		
		System.out.print("국어?");//70
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("영어?");//50
		eng = Integer.parseInt(br.readLine());
		
				
		//연산
		tot = kor + eng;
		
		//출력
		System.out.printf("이름: %s, 국어: %d, 영어: %d, 총점: %d",
				name,kor,eng,tot);
		
	}

}













