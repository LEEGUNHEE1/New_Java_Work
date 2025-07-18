package com.day15;

import java.util.Hashtable;
import java.util.Iterator;

//Map<key,value> 인터페이스
//Hashtable : Vector와 동일
//HashMap : ArrayList와 동일
//key는 중복 값을 가질수 없다(Set)
//key가 중복되면 수정이 된다
//Map은 iterator가 없다

public class Test2 {
	
	//Value
	public static final String name[] = 
	{"배수지","유인나","정인선","정소미","서예지"};
	
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
		
		//key를 넣으면 value값을 준다
		String str;
		str = h.get("111-1111");
		if(str==null) {
			System.out.println("자료없음");
		}else {
			System.out.println(str);
		}
		
		//키가 존재하는지 검사
		if(h.containsKey("222-2222")) {
			System.out.println("222-2222키 있다");
		}
		
		//값이 존재하는지 검사
		if(h.containsValue("서예지")) {
			System.out.println("예지 있어요.");
		}
		
		//데이터 삭제
		h.remove("222-2222");
		if(h.containsKey("222-2222")) {
			System.out.println("222-2222 있다");
		}else {
			System.out.println("222-2222 없다");
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





