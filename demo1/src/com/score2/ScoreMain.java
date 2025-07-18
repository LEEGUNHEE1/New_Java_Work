package com.score2;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		Score ob = new ScoreImpl();
		
		int ch;
		
		while(true) {
			
			do {
				System.out.println("*****************");
				System.out.println("***** 메뉴 ******");
				System.out.println("*****************");
				System.out.print("1.입력\n2.출력\n3.학번삭제\n4.학번검색\n" +
				"5.이름검색\n6.총점정렬\n7.학번정렬\n8.종료\n*****************\n: ");

				ch = sc.nextInt();
			}while(ch<1);
			
			switch(ch) {
				case 1: ob.input(); break;
				case 2: ob.print(); break;
				case 3: ob.deleteHak();break;
				case 4: ob.searchHak(); break;
				case 5: ob.searchName(); break;
				case 6: ob.descSortTot(); break;
				case 7: ob.ascSortHak(); break;
				default: 
					System.out.println("종료합니다");
					System.exit(0);
			}
		}
	}

}





