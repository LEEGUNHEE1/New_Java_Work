package com.main;

import java.util.Scanner;

import com.roomCheck.Room;
import com.roomCheck.RoomDAO;
import com.yeyakCheck.Yeyak;

public class HotelMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Room room = new Room();
		
		Yeyak yeyak = new Yeyak();
		
		int ch;
		
		String id = "a123";
		
		
		
		while (true) {
			
//			System.out.print("1.회원가입 2.로그인 3.종료");
//			
//			System.out.print("1.호텔예약 2.객실 확인 3.예약확인  4.회원 정보 5.종료");
//
//			//1 호텔예약
//			System.out.print("1.객실 선택 2.랜덤 배정 (추가할인) 3.뒤로가기 ");
//			//3.예약확인
//			System.out.print("예약번호 : ");
//			System.out.print("1.예약 변경 2.예약 취소 3.뒤로가기");
//			
//			//4.회원정보
//			System.out.print("1.회원정보수정 2.회원탈퇴 3.뒤로가기");
			
			
			
			
		do {
			
			System.out.print("1.호텔예약 2.객실 확인 3.예약확인  4.회원 정보 5.종료");
			ch = sc.nextInt();
			
			
		} while (ch < 1 || ch > 5);
			
		switch (ch) {
		case 2:
			room.printAllRoom();
			break;
		case 3:
			yeyak.printAllYeyak(id);
			break;

		default:
			break;
		}
			
			
		}

	}

}





