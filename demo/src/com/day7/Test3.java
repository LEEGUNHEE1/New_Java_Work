package com.day7;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		//10명 이내의 이름과 점수를 입력 받아
		//석차 구하기

		Scanner sc = new Scanner(System.in);

		String[] name;
		int[] score;
		int[] rank;

		int inwon,i,j,t1;
		String t2;

		do {
			System.out.print("인원수?[1~10]");//3
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);

		//배열을 메모리 할당함(객체를 생성)
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];
		
		//System.out.println(rank[0] + ":" + rank[1] + ":" 
		//		+ rank[2]);

		for(i=0;i<inwon;i++) {

			System.out.print((i+1) + "번째 이름?");
			name[i] = sc.next();

			System.out.print("점수?");
			score[i] = sc.nextInt();

		}

		//연산
		
		//석차 초기화
		for(i=0;i<inwon;i++) {
			rank[i] = 1;
		}
		
		//System.out.println(rank[0] + ":" + rank[1] + ":" 
		//				+ rank[2]);

		for(i=0;i<inwon-1;i++) {
			for(j=i+1;j<inwon;j++) {				
				
				//석차 구하기
				//score를 비교해서 작은 값의 
				//rank에  +1
				if(score[i]>score[j]) {						
					rank[j]++;
				}else if(score[i]<score[j]){
					rank[i]++;
				}
			}
		}

		//출력
		for(i=0;i<inwon;i++) {
			System.out.printf("%8s %4d %4d\n",
					name[i],score[i],rank[i]);
		}

	}

}



























