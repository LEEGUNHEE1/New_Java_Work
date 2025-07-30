package com.day14;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test6 {

	private static final String city[] = {"����","�λ�","�뱸",
			"��õ","����","����","���"};	
	
	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		
		for(String c : city) {
			v.add(c);
		}
		
		//v.add(10);
		//v.add('c');
		
		String str;
		str = v.firstElement();
		System.out.println("ù��° ���: " + str);
		
		str = v.lastElement();
		System.out.println("������ ���: " + str);
		
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
		
		System.out.println("������ �ʱ� �뷮: " + v.capacity());
		
		for(String c : city) {
			v1.add(c);
		}
		
		for(String s : v1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("�������� ����: " + v1.size());
		
		//����
		v1.set(0, "Seoul");
		v1.set(1, "Pusan");
		
		for(String s : v1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//����
		v1.insertElementAt("���ѹα�", 0);
		for(String s : v1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//�˻�
		int index = v1.indexOf("�뱸");//3
		if(index!=-1) {
			System.out.println("����: " + index);
		}else {
			System.out.println("����: " + index);
		}
		
		//��������
		Collections.sort(v1);
		for(String s : v1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//��������
		Collections.sort(v1, Collections.reverseOrder());
		for(String s : v1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//����
		v1.remove("Pusan");//v1.remove(7);
		for(String s : v1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//�뷮����
		for(int i=1;i<=20;i++) {
			v1.add(Integer.toString(i));
		}
		for(String s : v1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("������ �뷮: " + v1.capacity());
		System.out.println("�������� ����: " + v1.size());
		
		//���� ����
		//v1.subList(2, 5);
		
		for(int i=1;i<=10;i++) {
			v1.remove(5);
		}		
		for(String s : v1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("������ �뷮: " + v1.capacity());
		System.out.println("�������� ����: " + v1.size());
		
		//�� ���Ͱ��� ����
		v1.trimToSize();
		System.out.println("������ �뷮: " + v1.capacity());
		System.out.println("�������� ����: " + v1.size());
		
		//��� ������ ����
		v1.clear();
		System.out.println("������ �뷮: " + v1.capacity());
		System.out.println("�������� ����: " + v1.size());
		
		//�� ���Ͱ��� ����
		v1.trimToSize();
		System.out.println("������ �뷮: " + v1.capacity());
		System.out.println("�������� ����: " + v1.size());
		
	}

}





























