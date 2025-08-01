package com.roomCheck;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Room {

	Scanner sc = new Scanner(System.in);
	RoomDAO dao = new RoomDAO();
	int ch;

	// 모든 방 출력
	public void printAllRoom() {
		
		System.out.println();
		System.out.println("***********************************");
		System.out.println("**********모든 방 목록*************");
		System.out.println("***********************************");
		
		
		List<RoomDTO> lists = dao.selectAllRoom();
		
		Iterator<RoomDTO> it = lists.iterator();
		
		while (it.hasNext()) {
			
			RoomDTO	dto = it.next();
			
			System.out.println(dto);
			
		}
		
		while (true) {
		
			do {
				
				System.out.print("1.빈 방 확인 2. 예약된 방 확인 3.뒤로가기");
				ch = sc.nextInt();
				
			} while (ch <1 || ch >3);
			
			switch (ch) {
			
			case 1:
				printEmptyRoom();
				break;
				
			case 2:
				printYeyakRoom();
				break;

			case 3:
				System.out.println();
				return;

			}
		}
	}

	// 빈 방 출력
	public void printEmptyRoom() {
		System.out.println();
		System.out.println("***********************************");
		System.out.println("***********빈 방 목록**************");
		System.out.println("***********************************");
		

		List<RoomDTO> lists = dao.emptyRoom();

		Iterator<RoomDTO> it = lists.iterator();

		while (it.hasNext()) {

			RoomDTO dto = it.next();

			System.out.println(dto);

		}

	}

	// 예약된 방 출력
	public void printYeyakRoom() {
		
		System.out.println();
		System.out.println("***********************************");
		System.out.println("*********예약된 방 목록************");
		System.out.println("***********************************");

		List<RoomDTO> lists = dao.yeyakRoom();

		Iterator<RoomDTO> it = lists.iterator();

		while (it.hasNext()) {

			RoomDTO dto = it.next();

			System.out.println(dto);

		}

	}

}
