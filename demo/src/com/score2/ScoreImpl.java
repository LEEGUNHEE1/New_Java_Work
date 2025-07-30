package com.score2;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {

	private List<ScoreVO> lists;

	Scanner sc = new Scanner(System.in);

	File f = new File("c:\\doc\\Score.txt");

	public ScoreImpl() {

		if (!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
		}

		if (!f.exists()) {
			return;
		}

		try {

			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);

			lists = (ArrayList<ScoreVO>) ois.readObject();

			ois.close();
			fis.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	@Override
	public void input() {

		ScoreVO vo = new ScoreVO();

		System.out.print("학번 : ");
		vo.setHak(sc.next());

		System.out.print("이름 : ");
		vo.setName(sc.next());

		System.out.print("국어점수 : ");
		vo.setKor(sc.nextInt());

		System.out.print("영어점수 : ");
		vo.setEng(sc.nextInt());

		System.out.print("수학점수 : ");
		vo.setMat(sc.nextInt());

		if (lists == null) {
			lists = new ArrayList<ScoreVO>();
		}

		lists.add(vo);

	}

	@Override
	public void searchHak() {

		System.out.print("검색할 학번 : ");
		String searchHak = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			if (searchHak.equals(vo.getHak())) {
				System.out.println(vo);
				break;
			}

		}

	}

	@Override
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			if (searchName.equals(vo.getName())) {
				System.out.println(vo);

			}
		}
	}

	@Override
	public void descSortTot() {

		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {

				return vo1.getTot() < vo2.getTot() ? 1 : -1;
			}

		};

		Collections.sort(lists, comp);

		print();

	}

	@Override
	public void ascSortHak() {
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
		System.out.print("삭제할 학번 : ");
		String hak = sc.next();

		Iterator<ScoreVO> it = lists.iterator();
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			if (vo.getHak().equals(hak)) {
				lists.remove(vo);
				break;
			}
		}

	}

	@Override
	public void memorySave() throws Exception {

		if (lists != null) {

			FileOutputStream fos = new FileOutputStream(f);

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(lists);

			oos.close();
			fos.close();

		}

	}

	@Override
	public void print() {

		if (lists == null) {
			return;
		}
		Iterator<ScoreVO> it = lists.iterator();
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo);
		}
	}
}