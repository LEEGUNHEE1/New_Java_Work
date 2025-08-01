package com.yeyakCheck;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.roomCheck.Room;
import com.roomCheck.RoomDAO;
import com.roomCheck.RoomDTO;

public class Yeyak {

	Scanner sc = new Scanner(System.in);

	YeyakDAO dao = new YeyakDAO();
	
	RoomDAO rdao = new RoomDAO();
	
	Room room = new Room();

	public void printAllYeyak(String id) {

		int ch = 0;

		System.out.println();
		System.out.println("**************************************");
		System.out.println("*********" + id + "�� ���� ����***********");
		System.out.println("**************************************");

		List<YeyakDTO> lists = dao.selectAllYeyak(id);

		Iterator<YeyakDTO> it = lists.iterator();

		YeyakDTO dto;

		int cnt = 0;

		while (it.hasNext()) {

			cnt++;

			dto = it.next();

			System.out.println(cnt + ". " + dto);

		}
		System.out.println();

		System.out.println("�ڷΰ��� [0] ");
		System.out.print("���� Ȯ�� [��ȣ�Է�] : ");
		ch = sc.nextInt();
		
		if (ch==0) {
			
			System.out.println();
			return;
			
		}
		
		dto= lists.get(ch-1);
		
		RoomDTO rdto = rdao.yeyakRoomCheck(dto.getRoomNum());
		
		System.out.println(rdto);
		System.out.printf("�Խ� �ð� : %s\n", dto.getInTime());
		System.out.printf("��� �ð� : %s\n", dto.getOutTime());
		System.out.println();
		
		while (true) {
			
			do {
				
				System.out.print("1.���� ���� 2. ���� ��� 3.�ڷΰ���");
				ch = sc.nextInt();
				
			} while (ch <1 || ch >3);
			
			switch (ch) {
			
			case 1:
				printUpdateYetak(dto);
				break;
				
			case 2:
				printDeleteYetak(dto);
				return;

			case 3:
				System.out.println();
				return;

			}
		}
		
	}

	public void printUpdateYetak(YeyakDTO dto) {
		
		int ch = 0;
		
		String inTime;
		String outTime;
		
		
		
		room.printEmptyRoom();
		
		System.out.print("������ �� ��ȣ : ");
		ch=sc.nextInt();
		
		System.out.print("������ �Խ� ��¥ [YYYY-MM-DD]: ");
		inTime = sc.next();
		
		System.out.print("������ ��� ��¥ [YYYY-MM-DD]: ");
		outTime = sc.next();
		
		YeyakDTO upDTO = dao.updateYeyak(dto.getRoomNum(),ch,inTime,outTime);
		
		System.out.println();
		System.out.println("���� ���� �Ϸ�");
		System.out.println(upDTO);
		System.out.println();
	}

	public void printDeleteYetak(YeyakDTO dto) {
		int result;
		
		result = dao.deleteYeyak(dto.getRoomNum());
		
		if (result == 1) {
			System.out.println();
			System.out.println("������ ��� �Ǿ����ϴ�");
			System.out.println();
			return;
		}
			
	}

}
