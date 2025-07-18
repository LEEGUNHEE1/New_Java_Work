package com.day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		//이름과 3과목의 점수를 입력받아 다음 조건에 따라 출력
		//모든 과목의 점수가 40점 이상이고 평균이 60점 이상이면 합격
		//한과목이라도 40점 미만이고 평균이 60점 이상이면 과락
		//평균이 60점 미만이면 불합격
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor,eng,mat,tot,avg;
		String pan="";
		
		System.out.print("이름?");//suzi
		name = sc.next();
		
		System.out.print("세과목의 점수?");//50 60 70
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		tot = kor+eng+mat;
		avg = tot/3;
		
		//이름과 3과목의 점수를 입력받아 다음 조건에 따라 출력
		//모든 과목의 점수가 40점 이상이고 평균이 60점 이상이면 합격
		//한과목이라도 40점 미만이고 평균이 60점 이상이면 과락
		//평균이 60점 미만이면 불합격
		
		if(kor>=40 && eng>=40 && mat>=40 && avg>=60) {
			pan = "합격";
		}else if(avg>=60) {
			pan = "과락";
		}else {
			pan = "불합격";
		}
				
		
		System.out.println("이름: " + name);
		System.out.println("총점: " + tot + "점");
		System.out.println("평균: " + avg + "점");
		System.out.println("판정: " + pan);

	}

}































