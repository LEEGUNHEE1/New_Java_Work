package com.naver;

import java.util.Scanner;

public class NaverMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Naver ob = new NaverImpl();
		
		int ch;
		while (true) {
			
			do {
				System.out.println("****���̹�****");
				System.out.print("1.ȸ������ 2.ȸ������Ʈ 3.ȸ������ 4. ȸ���˻� 5.�������� Ȯ��"+
				" 6.�������� ���� 7.���� : ");
				ch = sc.nextInt();
				
			} while (ch < 1);
			
			switch (ch) {
			case 1:
				ob.input();
				break;
			case 2:
				ob.showList();
				break;
			case 3:
				ob.delete();
				break;
			case 4:
				ob.searchID();
				break;
			case 5:
				ob.privateRecord();
				break;
			case 6:
				ob.update();
				break;
			default:
				System.exit(0);
				break;
			}
			
			
			
			
		}
	
	}

}