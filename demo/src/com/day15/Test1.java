package com.day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<String> lists = new ArrayList<String>();
		
		lists.add("����");
		lists.add("�λ�");
		lists.add("�뱸");
		
		Iterator<String> it1 = lists.iterator();
		while(it1.hasNext()) {
			String str = it1.next();
			System.out.print(str + " ");
		}
		System.out.println();
		
		ListIterator<String> it2 = lists.listIterator();
		while(it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		

		while(it2.hasPrevious()) {
			System.out.print(it2.previous() + " ");
		}
		System.out.println();
		
		
		List<String> lists1 = new ArrayList<String>();
		
		lists1.addAll(lists);
		lists1.add("��õ");
		
		int n = lists1.indexOf("�λ�");
		lists1.add(n+1,"����");
		
		for(String s : lists1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		List<String> lists2 = new ArrayList<String>();
		
		lists2.add("�ڹ����α׷���");
		lists2.add("�����ӿ�ũ");
		lists2.add("������");
		lists2.add("�ڹٺ�");
		lists2.add("�������� ��");
		
		String str;
		
		Iterator<String> it3 = lists2.iterator();
		while(it3.hasNext()) {
			str = it3.next();
			if(str.startsWith("��")) {
				System.out.println(str);
			}
					
		}
		
		
		
	}

}























