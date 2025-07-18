package com.day7;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		//10명 이내의 이름과 점수를 입력 받아
		//점수가 높은 사람순으로 출력(내림차순)

		Scanner sc = new Scanner(System.in);

		String[] name;
		int[] score;		
		
		int inwon,i,j,t1;
		String t2;

		do {
			System.out.print("인원수?[1~10]");//3
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);

		//배열을 메모리 할당함(객체를 생성)
		name = new String[inwon];
		score = new int[inwon];
		
		for(i=0;i<inwon;i++) {

			System.out.print((i+1) + "번째 이름?");
			name[i] = sc.next();

			System.out.print("점수?");
			score[i] = sc.nextInt();

		}

		//연산

		for(i=0;i<inwon-1;i++) {

			for(j=i+1;j<inwon;j++) {				

				if(score[i]<score[j]) {

					//점수 자리바꿈
					t1 = score[i];
					score[i] = score[j];
					score[j] = t1;

					//이름 자리바꿈
					t2 = name[i];
					name[i] = name[j];
					name[j] = t2;

				}
			}
		}

		//출력
		for(i=0;i<inwon;i++) {
			System.out.printf("%8s %4d\n",name[i],score[i]);
		}



	}

}



























