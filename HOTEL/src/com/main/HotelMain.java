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
			
//			System.out.print("1.ȸ������ 2.�α��� 3.����");
//			
//			System.out.print("1.ȣ�ڿ��� 2.���� Ȯ�� 3.����Ȯ��  4.ȸ�� ���� 5.����");
//
//			//1 ȣ�ڿ���
//			System.out.print("1.���� ���� 2.���� ���� (�߰�����) 3.�ڷΰ��� ");
//			//3.����Ȯ��
//			System.out.print("�����ȣ : ");
//			System.out.print("1.���� ���� 2.���� ��� 3.�ڷΰ���");
//			
//			//4.ȸ������
//			System.out.print("1.ȸ���������� 2.ȸ��Ż�� 3.�ڷΰ���");
			
			
			
			
		do {
			
			System.out.print("1.ȣ�ڿ��� 2.���� Ȯ�� 3.����Ȯ��  4.ȸ�� ���� 5.����");
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





