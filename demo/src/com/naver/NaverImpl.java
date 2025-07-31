package com.naver;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class NaverExcp{
	
	public void naverExcp(String id) throws Exception{
		
		int eng = 0, n = 0;
		char ch; 
		//8~15자
		if (id.length() < 8 || id.length() > 15) {
			
			throw new Exception("아이디는 8~15자 사이임");
		}
		
		//영어숫자 포함
		
		for (int i = 0; i < id.length(); i++) {
		
			ch = id.charAt(i);
			if ((ch > 'a' && ch < 'z') || (ch > 'A' && ch < 'Z') ) {
				eng++;
			}else if (ch > '0' && ch < '9') {
				n++;
			}
			
		}
		if (eng==0 || n==0) {
			throw new Exception("아이디 영어와 숫자 섞어야함");
		}
		
		
		//첫자는 영어
		ch = id.charAt(0);
		if ((ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z')) {
			throw new Exception("아이디 첫글자는 영어로");
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

		//8~15자
		//영어숫자 포함
		//첫글자 영어
		try {
			
			System.out.print("아이디 : ");
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
				System.out.println("아이디 중복");
				return;
			}
		}

		System.out.print("비밀번호 : ");
		vo.setPassword(sc.next());

		System.out.print("이메일주소 : ");
		vo.setEmail(sc.next());

		System.out.print("이름 : ");
		vo.setName(sc.next());

		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());

		System.out.print("성별 : ");
		vo.setGender(sc.next());

		System.out.print("전화번호 : ");
		vo.setTell(sc.next());

		lists.add(vo);

		System.out.println("회원가입완료");

	}

	@Override
	public void print() {

	}

	@Override
	public void delete() {

		System.out.print("삭제할 회원 아이디 : ");
		String id = sc.next();

		int i = 0;

		Iterator<NaverVO> it = lists.iterator();

		while (it.hasNext()) {
			NaverVO vo = it.next();
			if (id.equals(vo.getId())) {

				System.out.print("비밀번호 확인 : ");
				String password = sc.next();
				i = 1;

				if (password.equals(vo.getPassword())) {

					it.remove();
					System.out.println("삭제 완료");
					return;

				}

			}

		}
		if (i == 0) {
			System.out.println("아이디 틀림");
		} else {
			System.out.println("비밀번호 틀림");
		}

	}

	@Override
	public void searchID() {
		Iterator<NaverVO> it = lists.iterator();

		System.out.print("검색할 회원 ID : ");
		String name = sc.next();

		boolean flag = false;
		while (it.hasNext()) {
			NaverVO vo = it.next();
			if (name.equals(vo.getName())) {
				System.out.printf("\n회원 이름 : %s 회원 ID : %s", vo.getName(), vo.getId());
				System.out.println();
				System.out.println();
				flag = true;
			}

		}
		if (!flag) {
			System.out.println("검색한 회원 없음");
		}

	}

	@Override
	public void showList() {

		Iterator<NaverVO> it = lists.iterator();
		boolean flag = false;

		while (it.hasNext()) {
			NaverVO vo = it.next();
			System.out.printf("\n회원 이름 : %s 회원 ID : %s", vo.getName(), vo.getId());
			System.out.println();
			flag = true;
		}
		if (!flag) {
			System.out.println("가입한 회원 없음");
		}
	}

	@Override
	public void privateRecord() {

		System.out.print("가입정보 확인할 회원 아이디 : ");
		String id = sc.next();

		int i = 0;

		Iterator<NaverVO> it = lists.iterator();

		while (it.hasNext()) {
			NaverVO vo = it.next();
			if (id.equals(vo.getId())) {

				System.out.print("비밀번호 확인 : ");
				String password = sc.next();
				i = 1;

				if (password.equals(vo.getPassword())) {

					System.out.println(vo.getName() + "님의 가입정보");
					System.out.println(vo);
					return;

				}

			}

		}
		if (i == 0) {
			System.out.println("아이디 틀림");
		} else {
			System.out.println("비밀번호 틀림");
		}

	}

	@Override
	public void update() {

		System.out.print("수정할 회원 아이디 : ");
		String id = sc.next();
		boolean flag = false;

		Iterator<NaverVO> it = lists.iterator();

		while (it.hasNext()) {
			NaverVO vo = it.next();
			if (id.equals(vo.getId())) {

				System.out.print("비밀번호 확인 : ");
				String password = sc.next();
				flag = true;

				if (password.equals(vo.getPassword())) {

					System.out.print("아이디 : ");
					vo.setId(sc.next());

					System.out.print("비밀번호 : ");
					vo.setPassword(sc.next());

					System.out.print("이메일주소 : ");
					vo.setEmail(sc.next());

					System.out.print("이름 : ");
					vo.setName(sc.next());

					System.out.print("생년월일 : ");
					vo.setBirth(sc.next());

					System.out.print("성별 : ");
					vo.setGender(sc.next());

					System.out.print("전화번호 : ");
					vo.setTell(sc.next());

					System.out.println("회원정보 수정 완료");
					return;

				}

			}

		}
		if (!flag) {
			System.out.println("아이디 틀림");
		} else {
			System.out.println("비밀번호 틀림");
		}
	}

}