package com.day18;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

//객체의 직렬화
//메모리에 생성된 클래스객체의 멤버변수의 현재상태를
//그대로 보존해서 파일에 저장하거나 네트워크를 통해서
//전달할수있게 하는 기능
//바이트 단위로만 데이터를 전송
//장점은 객체 자체의 내용을 입출력형식에 구애받지 않고
//객체를 파일에 저장 함으로써 영속성을 제공한다
//Serializable이라는 인터페이스로 구현한다
//단 이 인터페이스는 메소드가 없다

public class Test1{

	public static void main(String[] args) throws Exception {
		
		Hashtable<String, String> h = 
				new Hashtable<String, String>();
		
		h.put("1", "배수지");
		h.put("2", "유인나");
		h.put("3", "서예지");//직렬화
		
		FileOutputStream fos = 
				new FileOutputStream("c:\\doc\\outer.txt");
		ObjectOutputStream oos =
				new ObjectOutputStream(fos);
		
		oos.writeObject(h);//upcast
		oos.close();
		fos.close();
		
		System.out.println("파일에 저장됨");
		
		
						
						
						
						
						
						
						
		

	}

}
























