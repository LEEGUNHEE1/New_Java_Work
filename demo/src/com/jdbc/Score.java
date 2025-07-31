package com.jdbc;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Score {

	Scanner sc = new Scanner(System.in);
	ScoreDAO dao = new ScoreDAO();
	int result;
	
	//추가
	public void insert() {

		//insert 여러번 하니까 메소드 안에 써야댐
		ScoreDTO dto = new ScoreDTO();
		
		System.out.print("학번 : ");
		dto.setHak(sc.next());
		
		System.out.print("이름 : ");
		dto.setName(sc.next());
		
		System.out.print("국어 : ");
		dto.setKor(sc.nextInt());
		
		System.out.print("영어 : ");
		dto.setEng(sc.nextInt());
		
		System.out.print("수학 : ");
		dto.setMat(sc.nextInt());

		result = dao.insertData(dto);
		
		if (result != 0) {
			System.out.println("추가성공");
		}else {
			System.out.println("추가실패");
		}
		
	}
	
	//수정
	public void update() {
		
		ScoreDTO dto = new ScoreDTO();
		
		System.out.print("수정할 학번 : ");
		dto.setHak(sc.next());
		
		System.out.print("수정할 국어 : ");
		dto.setKor(sc.nextInt());
		
		System.out.print("수정할 영어 : ");
		dto.setEng(sc.nextInt());
		
		System.out.print("수정할 수학 : ");
		dto.setMat(sc.nextInt());
		
		result = dao.updateDate(dto);
		
		if (result != 0) {
			System.out.println("수정성공");
		}else {
			System.out.println("수정실패");
		}
	}
	
	//삭제
	public void delete() {
		String hak;
		
		System.out.print("삭제할 학번 : ");
		hak = sc.next();
		
		result = dao.deleteDate(hak);
		
		if (result != 0) {
			System.out.println("삭제성공");
		}else {
			System.out.println("삭제실패");
		}
		
	}
	
	//전체출력
	public void selectAll() {
		
		List<ScoreDTO> lists = dao.getLists();
		
		Iterator<ScoreDTO> it = lists.iterator();
		
		while (it.hasNext()) {
			
			ScoreDTO dto = it.next();
			
			System.out.println(dto);
			
		}
		
	}
	
	//학번검색
	public void selectHak() {
		
		String hak;
		
		System.out.print("검색할 학번 : ");
		hak=sc.next();
		
		ScoreDTO dto = dao.getListHak(hak);
		
		if (dto!=null) {
		
			System.out.println(dto);
			
		}else {
			System.out.println("검색실패");
		}
		
	}
	
	//이름검색
	public void selectName()
	{
		String name;
		
		System.out.print("검색할 이름 : ");
		name=sc.next();
		
		List<ScoreDTO> lists = dao.getListName(name);
		
		if (lists.size()!=0) {
			
			Iterator<ScoreDTO> it = lists.iterator();
			
			while (it.hasNext()) {
				
				ScoreDTO dto = it.next();
				
				System.out.println(dto);
				
			}
			
		}else {
			System.out.println("검색한 이름 없음");
		}
		
	}
	
}
