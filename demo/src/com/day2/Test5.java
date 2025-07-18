package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {
		//밑변(width)과 높이(height)를 입력받아 삼각형의 넓이를 구하기
		//밑변?: 10
		//높이?: 20
		//넓이: 100
		//넓이 = 밑변x높이 / 2

		//선언
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
				
		int width,height;
		double area;		

		//입력
		System.out.print("밑변?");//40
		width = Integer.parseInt(br.readLine());
		
		System.out.print("높이?");//50
		height = Integer.parseInt(br.readLine());

		//연산
		area = width * height / 2.0;

		//출력

		System.out.println("넓이: " + area);









	}

}
