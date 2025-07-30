package com.score;

import java.util.Scanner;

public class Score {
	
	Scanner sc = new Scanner(System.in);
	
	int inwon;
	Record[] rec;
	
	public void set() {		
		
		do {
			System.out.print("인원수?");//3
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);
		
		//배열의 객체를 생성
		rec = new Record[inwon];
		
	}
	
	public void input() {
		
		String[] title = {"국어?","영어?","수학?"};
		
		for(int i=0;i<inwon;i++) {
			
			rec[i] = new Record();
						
			System.out.print("이름?");//suzi
			rec[i].name = sc.next();
			
			for(int j=0;j<3;j++) {
				
				System.out.print(title[j]);//국,영,수
				rec[i].score[j] = sc.nextInt();
								
				rec[i].tot += rec[i].score[j];	//총점
			}
			
			rec[i].avg = rec[i].tot / 3; //평균
			
			System.out.println();
		}		
		
	}
	
	private void ranking() {
		
		int i,j;
		
		//석차 초기화
		for(i=0;i<inwon;i++) {
			rec[i].rank = 1;
		}		
		
		//석차구하기
		for(i=0;i<inwon-1;i++) {
			for(j=i+1;j<inwon;j++) {
				
				if(rec[i].tot>rec[j].tot) {
					rec[j].rank++;
				}else if(rec[i].tot<rec[j].tot) {
					rec[i].rank++;
				}
				
			}
		}
		
	}
	
	private String panjung(int jumsu) {
		
		String pan="";
		
		switch(jumsu/10) {
		case 10:					
		case 9:
			pan = "수"; break;
		case 8:
			pan = "우"; break;
		case 7:
			pan = "미"; break;
		case 6:
			pan = "양"; break;
		default:
			pan = "가"; break;			
		}
		
		return pan;
	}
	
	
	public void print() {
		
		ranking();
		
		for(int i=0;i<inwon;i++) {
			
			System.out.printf("%8s",rec[i].name);
			
			for(int j=0;j<3;j++) {
				System.out.printf("%3d(%s)",rec[i].score[j],
						panjung(rec[i].score[j]));
			}
			
			System.out.printf("%5d",rec[i].tot);
			System.out.printf("%5d",rec[i].avg);
			System.out.printf("%5d\n",rec[i].rank);
			
		}
		
	}

}






























