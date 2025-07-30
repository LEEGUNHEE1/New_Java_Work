package com.day14;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test6 {

	private static final String city[] = {"서울","부산","대구",
			"인천","광주","대전","울산"};	
	
	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		
		for(String c : city) {
			v.add(c);
		}
		
		//v.add(10);
		//v.add('c');
		
		String str;
		str = v.firstElement();
		System.out.println("첫번째 요소: " + str);
		
		str = v.lastElement();
		System.out.println("마지막 요소: " + str);
		
		str = v.get(1);
		System.out.println(str);
		
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		
		
		Iterator<String> it = v.iterator();
		
		while(it.hasNext()) {			
			str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		
		System.out.println("---------------------");
		
		while(it.hasNext()) {			
			str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		
		System.out.println("---------------------");
		
		Vector<String> v1 = new Vector<String>();
		
		System.out.println("백터의 초기 용량: " + v.capacity());
		
		for(String c : city) {
			v1.add(c);
		}
		
		for(String s : v1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("데이터의 갯수: " + v1.size());
		
		//수정
		v1.set(0, "Seoul");
		v1.set(1, "Pusan");
		
		for(String s : v1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//삽입
		v1.insertElementAt("대한민국", 0);
		for(String s : v1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//검색
		int index = v1.indexOf("대구");//3
		if(index!=-1) {
			System.out.println("성공: " + index);
		}else {
			System.out.println("실패: " + index);
		}
		
		//오름차순
		Collections.sort(v1);
		for(String s : v1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//내림차순
		Collections.sort(v1, Collections.reverseOrder());
		for(String s : v1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//삭제
		v1.remove("Pusan");//v1.remove(7);
		for(String s : v1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//용량증가
		for(int i=1;i<=20;i++) {
			v1.add(Integer.toString(i));
		}
		for(String s : v1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("백터의 용량: " + v1.capacity());
		System.out.println("데이터의 갯수: " + v1.size());
		
		//범위 삭제
		//v1.subList(2, 5);
		
		for(int i=1;i<=10;i++) {
			v1.remove(5);
		}		
		for(String s : v1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("백터의 용량: " + v1.capacity());
		System.out.println("데이터의 갯수: " + v1.size());
		
		//빈 벡터공간 삭제
		v1.trimToSize();
		System.out.println("백터의 용량: " + v1.capacity());
		System.out.println("데이터의 갯수: " + v1.size());
		
		//모든 데이터 삭제
		v1.clear();
		System.out.println("백터의 용량: " + v1.capacity());
		System.out.println("데이터의 갯수: " + v1.size());
		
		//빈 벡터공간 삭제
		v1.trimToSize();
		System.out.println("백터의 용량: " + v1.capacity());
		System.out.println("데이터의 갯수: " + v1.size());
		
	}

}





























