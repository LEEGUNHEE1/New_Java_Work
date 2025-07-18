package com.score2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score{
	
	private List<ScoreVO> lists = new ArrayList<ScoreVO>();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void input() {		
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("학번?");
		vo.setHak(sc.next());
		
		System.out.print("이름?");
		vo.setName(sc.next());
		
		System.out.print("국어?");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어?");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학?");
		vo.setMat(sc.nextInt());
		
		lists.add(vo);
		
	}

	@Override
	public void print() {
		
		Iterator<ScoreVO> it = lists.iterator();
		
		while(it.hasNext()) {
			ScoreVO vo = it.next();			
			
			System.out.println(vo);
		}		
	}

	@Override
	public void searchHak() {
		
		System.out.print("검색할 학번?");//111
		String hak = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			
			if(hak.equals(vo.getHak())) {
				System.out.println(vo.toString());
				break;
			}
			
		}
		
	}

	@Override
	public void searchName() {
		
		System.out.print("검색할 이름?");//suzi
		String name = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			
			if(name.equals(vo.getName())) {
				System.out.println(vo.toString());				
			}
			
		}		
	}

	@Override
	public void descSortTot() {
		
		//정렬방법(무명의클래스)
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot()<vo2.getTot()?1:-1;
			}
		};				
				
		Collections.sort(lists, comp);
		print();
		
	}

	@Override
	public void ascSortHak() {
		
		//정렬방법(무명의클래스)
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getHak().compareTo(vo2.getHak());
			}
		};				
				
		Collections.sort(lists, comp);
		print();
		
	}

	@Override
	public void deleteHak() {
		
		System.out.print("삭제할 학번?");//222
		String hak = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			
			if(vo.getHak().equals(hak)) {
				lists.remove(vo);
				break;				
			}
		}
		
		
	}

}







