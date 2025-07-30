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
		
		System.out.print("�й�?");///111
		hak = sc.next();
		
		if(searchHak(hak)) {
			System.out.println("�й��� �����մϴ�. �߰� ����");
			return;
		}
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("�̸�?");
		vo.setName(sc.next());
		
		System.out.print("����?");
		vo.setKor(sc.nextInt());
		
		System.out.print("����?");
		vo.setEng(sc.nextInt());
		
		System.out.print("����?");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);
		
		System.out.println("�߰� ����!!");		
		
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
		
		System.out.print("������ �й�?");//111
		hak = sc.next();
		
		if(searchHak(hak)) {
			hMap.remove(hak);
			System.out.println("���� ����!!");
		}else {
			System.out.println("���� ����!!");
		}
		
	}

	@Override
	public void update() {
		
		System.out.print("������ �й�?");
		hak = sc.next();
		
		if(!searchHak(hak)) {
			System.out.println("���� ����!!");
			return;
		}
		//����
		
	//���2
	ScoreVO preVO = hMap.get(hak);
	String preName = preVO.getName();
	
	ScoreVO vo = new ScoreVO();
	
	vo.setName(preName);
	
	System.out.print("����?");
	vo.setKor(sc.nextInt());
	
	System.out.print("����?");
	vo.setEng(sc.nextInt());
	
	System.out.print("����?");
	vo.setMat(sc.nextInt());
	
	hMap.put(hak, vo);
		
		//���1
		/*
		ScoreVO vo = hMap.get(hak);		
		
		System.out.print("����?");
		vo.setKor(sc.nextInt());
		
		System.out.print("����?");
		vo.setEng(sc.nextInt());
		
		System.out.print("����?");
		vo.setMat(sc.nextInt());
		
		System.out.println("���� ����!!");
		*/
	}

	@Override
	public void findHak() {
		
		System.out.print("�˻��� �й�?");
		hak = sc.next();
		
		if(!searchHak(hak)) {
			System.out.println("�й��� �����ϴ� �˻� ����!!");
			return;		
		}
		
		ScoreVO vo = hMap.get(hak);
		System.out.println(hak + " " + vo.toString());
		
	}

	@Override
	public void findName() {
		
		System.out.print("�˻��� �̸�?");
		String name = sc.next();//suzi
		
		Iterator<String> it = hMap.keySet().iterator();
		
		boolean flag = false;
		
		while(it.hasNext()) {
			
			String hak = it.next();//key�� ������
			ScoreVO vo = hMap.get(hak);//key���ָ� value��
			
			if(name.equals(vo.getName())) {
				System.out.println(hak + " " + vo.toString());
				flag = true;
			}
			
		}
		
		if(!flag) {
			System.out.println("�̸��� �����ϴ�");
		}
		
		
	}

}







