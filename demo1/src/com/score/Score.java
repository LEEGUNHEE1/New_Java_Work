package com.score;

import java.util.Scanner;

public class Score {
	
	Scanner sc = new Scanner(System.in);
	
	int inwon;
	Record[] rec;
	
	public void set() {		
		
		do {
			System.out.print("�ο���?");//3
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);
		
		//�迭�� ��ü�� ����
		rec = new Record[inwon];
		
	}
	
	public void input() {
		
		String[] title = {"����?","����?","����?"};
		
		for(int i=0;i<inwon;i++) {
			
			rec[i] = new Record();
						
			System.out.print("�̸�?");//suzi
			rec[i].name = sc.next();
			
			for(int j=0;j<3;j++) {
				
				System.out.print(title[j]);//��,��,��
				rec[i].score[j] = sc.nextInt();
								
				rec[i].tot += rec[i].score[j];	//����
			}
			
			rec[i].avg = rec[i].tot / 3; //���
			
			System.out.println();
		}		
		
	}
	
	private void ranking() {
		
		int i,j;
		
		//���� �ʱ�ȭ
		for(i=0;i<inwon;i++) {
			rec[i].rank = 1;
		}		
		
		//�������ϱ�
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
			pan = "��"; break;
		case 8:
			pan = "��"; break;
		case 7:
			pan = "��"; break;
		case 6:
			pan = "��"; break;
		default:
			pan = "��"; break;			
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






























