package com.day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<String> lists = new ArrayList<String>();
		
		lists.add("서울");
		lists.add("부산");
		lists.add("대구");
		
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
		lists1.add("인천");
		
		int n = lists1.indexOf("부산");
		lists1.add(n+1,"광주");
		
		for(String s : lists1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		List<String> lists2 = new ArrayList<String>();
		
		lists2.add("자바프로그래머");
		lists2.add("프레임워크");
		lists2.add("스프링");
		lists2.add("자바봐");
		lists2.add("스프링은 봄");
		
		String str;
		
		Iterator<String> it3 = lists2.iterator();
		while(it3.hasNext()) {
			str = it3.next();
			if(str.startsWith("스")) {
				System.out.println(str);
			}
					
		}
		
		
		
	}

}























