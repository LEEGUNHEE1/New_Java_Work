package com.roomCheck;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Room {

	Scanner sc = new Scanner(System.in);
	RoomDAO dao = new RoomDAO();
	int ch;

	// ��� �� ���
	public void printAllRoom() {
		
		System.out.println();
		System.out.println("***********************************");
		System.out.println("**********��� �� ���*************");
		System.out.println("***********************************");
		
		
		List<RoomDTO> lists = dao.selectAllRoom();
		
		Iterator<RoomDTO> it = lists.iterator();
		
		while (it.hasNext()) {
			
			RoomDTO	dto = it.next();
			
			System.out.println(dto);
			
		}
		
		while (true) {
		
			do {
				
				System.out.print("1.�� �� Ȯ�� 2. ����� �� Ȯ�� 3.�ڷΰ���");
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

	// �� �� ���
	public void printEmptyRoom() {
		System.out.println();
		System.out.println("***********************************");
		System.out.println("***********�� �� ���**************");
		System.out.println("***********************************");
		

		List<RoomDTO> lists = dao.emptyRoom();

		Iterator<RoomDTO> it = lists.iterator();

		while (it.hasNext()) {

			RoomDTO dto = it.next();

			System.out.println(dto);

		}

	}

	// ����� �� ���
	public void printYeyakRoom() {
		
		System.out.println();
		System.out.println("***********************************");
		System.out.println("*********����� �� ���************");
		System.out.println("***********************************");

		List<RoomDTO> lists = dao.yeyakRoom();

		Iterator<RoomDTO> it = lists.iterator();

		while (it.hasNext()) {

			RoomDTO dto = it.next();

			System.out.println(dto);

		}

	}

}
