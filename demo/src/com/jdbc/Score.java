package com.jdbc;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Score {

	Scanner sc = new Scanner(System.in);
	ScoreDAO dao = new ScoreDAO();
	int result;
	
	//�߰�
	public void insert() {

		//insert ������ �ϴϱ� �޼ҵ� �ȿ� ��ߴ�
		ScoreDTO dto = new ScoreDTO();
		
		System.out.print("�й� : ");
		dto.setHak(sc.next());
		
		System.out.print("�̸� : ");
		dto.setName(sc.next());
		
		System.out.print("���� : ");
		dto.setKor(sc.nextInt());
		
		System.out.print("���� : ");
		dto.setEng(sc.nextInt());
		
		System.out.print("���� : ");
		dto.setMat(sc.nextInt());

		result = dao.insertData(dto);
		
		if (result != 0) {
			System.out.println("�߰�����");
		}else {
			System.out.println("�߰�����");
		}
		
	}
	
	//����
	public void update() {
		
		ScoreDTO dto = new ScoreDTO();
		
		System.out.print("������ �й� : ");
		dto.setHak(sc.next());
		
		System.out.print("������ ���� : ");
		dto.setKor(sc.nextInt());
		
		System.out.print("������ ���� : ");
		dto.setEng(sc.nextInt());
		
		System.out.print("������ ���� : ");
		dto.setMat(sc.nextInt());
		
		result = dao.updateDate(dto);
		
		if (result != 0) {
			System.out.println("��������");
		}else {
			System.out.println("��������");
		}
	}
	
	//����
	public void delete() {
		String hak;
		
		System.out.print("������ �й� : ");
		hak = sc.next();
		
		result = dao.deleteDate(hak);
		
		if (result != 0) {
			System.out.println("��������");
		}else {
			System.out.println("��������");
		}
		
	}
	
	//��ü���
	public void selectAll() {
		
		List<ScoreDTO> lists = dao.getLists();
		
		Iterator<ScoreDTO> it = lists.iterator();
		
		while (it.hasNext()) {
			
			ScoreDTO dto = it.next();
			
			System.out.println(dto);
			
		}
		
	}
	
	//�й��˻�
	public void selectHak() {
		
		String hak;
		
		System.out.print("�˻��� �й� : ");
		hak=sc.next();
		
		ScoreDTO dto = dao.getListHak(hak);
		
		if (dto!=null) {
		
			System.out.println(dto);
			
		}else {
			System.out.println("�˻�����");
		}
		
	}
	
	//�̸��˻�
	public void selectName()
	{
		String name;
		
		System.out.print("�˻��� �̸� : ");
		name=sc.next();
		
		List<ScoreDTO> lists = dao.getListName(name);
		
		if (lists.size()!=0) {
			
			Iterator<ScoreDTO> it = lists.iterator();
			
			while (it.hasNext()) {
				
				ScoreDTO dto = it.next();
				
				System.out.println(dto);
				
			}
			
		}else {
			System.out.println("�˻��� �̸� ����");
		}
		
	}
	
}
