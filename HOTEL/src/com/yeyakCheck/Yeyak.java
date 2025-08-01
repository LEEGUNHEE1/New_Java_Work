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
		System.out.println("*********" + id + "님 예약 내역***********");
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

		System.out.println("뒤로가기 [0] ");
		System.out.print("예약 확인 [번호입력] : ");
		ch = sc.nextInt();
		
		if (ch==0) {
			
			System.out.println();
			return;
			
		}
		
		dto= lists.get(ch-1);
		
		RoomDTO rdto = rdao.yeyakRoomCheck(dto.getRoomNum());
		
		System.out.println(rdto);
		System.out.printf("입실 시간 : %s\n", dto.getInTime());
		System.out.printf("퇴실 시간 : %s\n", dto.getOutTime());
		System.out.println();
		
		while (true) {
			
			do {
				
				System.out.print("1.예약 변경 2. 예약 취소 3.뒤로가기");
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
		
		System.out.print("변경할 방 번호 : ");
		ch=sc.nextInt();
		
		System.out.print("변경할 입실 날짜 [YYYY-MM-DD]: ");
		inTime = sc.next();
		
		System.out.print("변경할 퇴실 날짜 [YYYY-MM-DD]: ");
		outTime = sc.next();
		
		YeyakDTO upDTO = dao.updateYeyak(dto.getRoomNum(),ch,inTime,outTime);
		
		System.out.println();
		System.out.println("예약 변경 완료");
		System.out.println(upDTO);
		System.out.println();
	}

	public void printDeleteYetak(YeyakDTO dto) {
		int result;
		
		result = dao.deleteYeyak(dto.getRoomNum());
		
		if (result == 1) {
			System.out.println();
			System.out.println("예약이 취소 되었습니다");
			System.out.println();
			return;
		}
			
	}

}
