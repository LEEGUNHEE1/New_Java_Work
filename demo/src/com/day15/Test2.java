package com.day15;

import java.util.Hashtable;
import java.util.Iterator;

//Map<key,value> �������̽�
//Hashtable : Vector�� ����
//HashMap : ArrayList�� ����
//key�� �ߺ� ���� ������ ����(Set)
//key�� �ߺ��Ǹ� ������ �ȴ�
//Map�� iterator�� ����

public class Test2 {
	
	//Value
	public static final String name[] = 
	{"�����","���γ�","���μ�","���ҹ�","������"};
	
	//Key
	public static final String tel[] = 
	{"111-1111","222-2222","333-3333","111-1111","444-4444"};

	public static void main(String[] args) {

		Hashtable<String, String> h = 
				new Hashtable<String, String>();
		
		for(int i=0;i<name.length;i++) {
			h.put(tel[i], name[i]);
		}
		
		System.out.println(h);
		
		//key�� ������ value���� �ش�
		String str;
		str = h.get("111-1111");
		if(str==null) {
			System.out.println("�ڷ����");
		}else {
			System.out.println(str);
		}
		
		//Ű�� �����ϴ��� �˻�
		if(h.containsKey("222-2222")) {
			System.out.println("222-2222Ű �ִ�");
		}
		
		//���� �����ϴ��� �˻�
		if(h.containsValue("������")) {
			System.out.println("���� �־��.");
		}
		
		//������ ����
		h.remove("222-2222");
		if(h.containsKey("222-2222")) {
			System.out.println("222-2222 �ִ�");
		}else {
			System.out.println("222-2222 ����");
		}
		
		System.out.println(h);
		
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			
			String key = it.next();//key
			String value = h.get(key);//value
			
			System.out.println(key + ":" + value);
		}
	}

}





