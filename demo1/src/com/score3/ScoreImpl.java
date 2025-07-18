package com.score3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreImpl implements Score{

	//private Map<String, ScoreVO> hMap = 
	//		new HashMap<String, ScoreVO>();
	
	private Map<String, ScoreVO> hMap = 
			new TreeMap<String, ScoreVO>();
	
	Scanner sc = new Scanner(System.in);
	String hak;//key
	
	@Override
	public void input() {
		
		System.out.print("학번?");///111
		hak = sc.next();
		
		if(searchHak(hak)) {
			System.out.println("학번이 존재합니다. 추가 실패");
			return;
		}
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("이름?");
		vo.setName(sc.next());
		
		System.out.print("국어?");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어?");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학?");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);
		
		System.out.println("추가 성공!!");		
		
	}

	@Override
	public boolean searchHak(String hak) {
		
		if(hMap.containsKey(hak)) {
			return true;
		}
		
		return false;
	}

	@Override
	public void print() {
		
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			String hak = it.next();//key
			ScoreVO vo = hMap.get(hak);//value
			System.out.println(hak + " " + vo.toString());
		}
		
	}

	@Override
	public void delete() {
		
		System.out.print("삭제할 학번?");//111
		hak = sc.next();
		
		if(searchHak(hak)) {
			hMap.remove(hak);
			System.out.println("삭제 성공!!");
		}else {
			System.out.println("삭제 실패!!");
		}
		
	}

	@Override
	public void update() {
		
		System.out.print("수정할 학번?");
		hak = sc.next();
		
		if(!searchHak(hak)) {
			System.out.println("수정 실패!!");
			return;
		}
		//수정
		
	//방법2
	ScoreVO preVO = hMap.get(hak);
	String preName = preVO.getName();
	
	ScoreVO vo = new ScoreVO();
	
	vo.setName(preName);
	
	System.out.print("국어?");
	vo.setKor(sc.nextInt());
	
	System.out.print("영어?");
	vo.setEng(sc.nextInt());
	
	System.out.print("수학?");
	vo.setMat(sc.nextInt());
	
	hMap.put(hak, vo);
		
		//방법1
		/*
		ScoreVO vo = hMap.get(hak);		
		
		System.out.print("국어?");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어?");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학?");
		vo.setMat(sc.nextInt());
		
		System.out.println("수정 성공!!");
		*/
	}

	@Override
	public void findHak() {
		
		System.out.print("검색할 학번?");
		hak = sc.next();
		
		if(!searchHak(hak)) {
			System.out.println("학번이 없습니다 검색 실패!!");
			return;		
		}
		
		ScoreVO vo = hMap.get(hak);
		System.out.println(hak + " " + vo.toString());
		
	}

	@Override
	public void findName() {
		
		System.out.print("검색할 이름?");
		String name = sc.next();//suzi
		
		Iterator<String> it = hMap.keySet().iterator();
		
		boolean flag = false;
		
		while(it.hasNext()) {
			
			String hak = it.next();//key를 꺼내줌
			ScoreVO vo = hMap.get(hak);//key를주면 value줌
			
			if(name.equals(vo.getName())) {
				System.out.println(hak + " " + vo.toString());
				flag = true;
			}
			
		}
		
		if(!flag) {
			System.out.println("이름이 없습니다");
		}
		
		
	}

}







