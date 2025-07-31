package com.naver;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class NaverExcp{
	
	public void naverExcp(String id) throws Exception{
		
		int eng = 0, n = 0;
		char ch; 
		//8~15��
		if (id.length() < 8 || id.length() > 15) {
			
			throw new Exception("���̵�� 8~15�� ������");
		}
		
		//������� ����
		
		for (int i = 0; i < id.length(); i++) {
		
			ch = id.charAt(i);
			if ((ch > 'a' && ch < 'z') || (ch > 'A' && ch < 'Z') ) {
				eng++;
			}else if (ch > '0' && ch < '9') {
				n++;
			}
			
		}
		if (eng==0 || n==0) {
			throw new Exception("���̵� ����� ���� �������");
		}
		
		
		//ù�ڴ� ����
		ch = id.charAt(0);
		if ((ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z')) {
			throw new Exception("���̵� ù���ڴ� �����");
		}
		
		
	}
	
}

public class NaverImpl implements Naver {

	Scanner sc = new Scanner(System.in);
	List<NaverVO> lists = new ArrayList<NaverVO>();
	NaverExcp ne = new NaverExcp();

	@Override
	public void input() {
		NaverVO vo = new NaverVO();

		//8~15��
		//������� ����
		//ù���� ����
		try {
			
			System.out.print("���̵� : ");
			vo.setId(sc.next());
			ne.naverExcp(vo.getId());
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
			return;
		}
		

		Iterator<NaverVO> it = lists.iterator();

		while (it.hasNext()) {
			NaverVO vo1 = it.next();
			if (vo.getId().equals(vo1.getId())) {
				System.out.println("���̵� �ߺ�");
				return;
			}
		}

		System.out.print("��й�ȣ : ");
		vo.setPassword(sc.next());

		System.out.print("�̸����ּ� : ");
		vo.setEmail(sc.next());

		System.out.print("�̸� : ");
		vo.setName(sc.next());

		System.out.print("������� : ");
		vo.setBirth(sc.next());

		System.out.print("���� : ");
		vo.setGender(sc.next());

		System.out.print("��ȭ��ȣ : ");
		vo.setTell(sc.next());

		lists.add(vo);

		System.out.println("ȸ�����ԿϷ�");

	}

	@Override
	public void print() {

	}

	@Override
	public void delete() {

		System.out.print("������ ȸ�� ���̵� : ");
		String id = sc.next();

		int i = 0;

		Iterator<NaverVO> it = lists.iterator();

		while (it.hasNext()) {
			NaverVO vo = it.next();
			if (id.equals(vo.getId())) {

				System.out.print("��й�ȣ Ȯ�� : ");
				String password = sc.next();
				i = 1;

				if (password.equals(vo.getPassword())) {

					it.remove();
					System.out.println("���� �Ϸ�");
					return;

				}

			}

		}
		if (i == 0) {
			System.out.println("���̵� Ʋ��");
		} else {
			System.out.println("��й�ȣ Ʋ��");
		}

	}

	@Override
	public void searchID() {
		Iterator<NaverVO> it = lists.iterator();

		System.out.print("�˻��� ȸ�� ID : ");
		String name = sc.next();

		boolean flag = false;
		while (it.hasNext()) {
			NaverVO vo = it.next();
			if (name.equals(vo.getName())) {
				System.out.printf("\nȸ�� �̸� : %s ȸ�� ID : %s", vo.getName(), vo.getId());
				System.out.println();
				System.out.println();
				flag = true;
			}

		}
		if (!flag) {
			System.out.println("�˻��� ȸ�� ����");
		}

	}

	@Override
	public void showList() {

		Iterator<NaverVO> it = lists.iterator();
		boolean flag = false;

		while (it.hasNext()) {
			NaverVO vo = it.next();
			System.out.printf("\nȸ�� �̸� : %s ȸ�� ID : %s", vo.getName(), vo.getId());
			System.out.println();
			flag = true;
		}
		if (!flag) {
			System.out.println("������ ȸ�� ����");
		}
	}

	@Override
	public void privateRecord() {

		System.out.print("�������� Ȯ���� ȸ�� ���̵� : ");
		String id = sc.next();

		int i = 0;

		Iterator<NaverVO> it = lists.iterator();

		while (it.hasNext()) {
			NaverVO vo = it.next();
			if (id.equals(vo.getId())) {

				System.out.print("��й�ȣ Ȯ�� : ");
				String password = sc.next();
				i = 1;

				if (password.equals(vo.getPassword())) {

					System.out.println(vo.getName() + "���� ��������");
					System.out.println(vo);
					return;

				}

			}

		}
		if (i == 0) {
			System.out.println("���̵� Ʋ��");
		} else {
			System.out.println("��й�ȣ Ʋ��");
		}

	}

	@Override
	public void update() {

		System.out.print("������ ȸ�� ���̵� : ");
		String id = sc.next();
		boolean flag = false;

		Iterator<NaverVO> it = lists.iterator();

		while (it.hasNext()) {
			NaverVO vo = it.next();
			if (id.equals(vo.getId())) {

				System.out.print("��й�ȣ Ȯ�� : ");
				String password = sc.next();
				flag = true;

				if (password.equals(vo.getPassword())) {

					System.out.print("���̵� : ");
					vo.setId(sc.next());

					System.out.print("��й�ȣ : ");
					vo.setPassword(sc.next());

					System.out.print("�̸����ּ� : ");
					vo.setEmail(sc.next());

					System.out.print("�̸� : ");
					vo.setName(sc.next());

					System.out.print("������� : ");
					vo.setBirth(sc.next());

					System.out.print("���� : ");
					vo.setGender(sc.next());

					System.out.print("��ȭ��ȣ : ");
					vo.setTell(sc.next());

					System.out.println("ȸ������ ���� �Ϸ�");
					return;

				}

			}

		}
		if (!flag) {
			System.out.println("���̵� Ʋ��");
		} else {
			System.out.println("��й�ȣ Ʋ��");
		}
	}

}