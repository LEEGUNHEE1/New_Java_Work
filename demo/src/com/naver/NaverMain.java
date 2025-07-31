package com.naver;

import java.util.Scanner;

public class NaverMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Naver ob = new NaverImpl();
		
		int ch;
		while (true) {
			
			do {
				System.out.println("****네이버****");
				System.out.print("1.회원가입 2.회원리스트 3.회원삭제 4. 회원검색 5.가입정보 확인"+
				" 6.개인정보 수정 7.종료 : ");
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