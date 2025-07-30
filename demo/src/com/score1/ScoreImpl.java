package com.score1;

import java.util.Scanner;

public class ScoreImpl implements Score{

	Scanner sc = new Scanner(System.in);
	
	private int inwon;
	private Record[] rec;
	
	@Override
	public void set() {
		
		do {
			System.out.print("인원수?");//3
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);
		
		rec = new Record[inwon];//배열 객체생성
	}

	@Override
	public void input() {
		
		for(int i=0;i<inwon;i++) {
			
			rec[i] = new Record();
			
			System.out.print("학번?");
			rec[i].hak = sc.next();
			
			System.out.print("이름?");
			rec[i].name = sc.next();
			
			System.out.print("국어?");
			rec[i].kor = sc.nextInt();
			
			System.out.print("영어?");
			rec[i].eng = sc.nextInt();
			
			System.out.print("수학?");
			rec[i].mat = sc.nextInt();
			
			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			
			rec[i].ave = rec[i].tot / 3;
		}
		
	}
	
	private String panjung(int score) {
		
		String pan = "";
		
		switch(score/10) {
			case (10):
			case (9): pan="A"; break;
			case (8): pan="B"; break;
			case (7): pan="C"; break;
			case (6): pan="D"; break;
			default:pan="F"; break;
		}
		
		return pan;
	}

	@Override
	public void print() {
		
		for(int i=0;i<inwon;i++) {
			
			System.out.printf("%4s %6s %3d(%s) %3d(%s) %3d(%s) %3d %3d\n",
					rec[i].hak,rec[i].name,
					rec[i].kor,panjung(rec[i].kor),
					rec[i].eng,panjung(rec[i].eng),
					rec[i].mat,panjung(rec[i].mat),
					rec[i].tot,rec[i].ave);
			
		}
		
	}

}








