package com.day12;

//String에 도움을 주는 클래스
//StringBuffer
//StringBuilder

public class Test2 {
	
	public void stringTime() {
		
		System.out.println("String...");
		
		//long start = System.currentTimeMillis();
		long start = System.nanoTime();
		
		String str = "A";
		
		for(int i=1;i<=50000;i++) {
			str += "A";			
		}
		
		long end = System.nanoTime();
		
		System.out.println("실행 시간: " + (end-start));
		
	}
	
	public void stringBufferTime() {
		
		System.out.println("StringBuffer...");
				
		long start = System.nanoTime();
		
		StringBuffer str = new StringBuffer("A");
				
		for(int i=1;i<=50000;i++) {
			str.append("A");		
		}
		
		long end = System.nanoTime();
		
		System.out.println("실행 시간: " + (end-start));
		
	}
	
	public void stringBuilderTime() {
		
		System.out.println("StringBuilder...");
				
		long start = System.nanoTime();
		
		StringBuilder str = new StringBuilder("A");
				
		for(int i=1;i<=50000;i++) {
			str.append("A");		
		}
		
		long end = System.nanoTime();
		
		System.out.println("실행 시간: " + (end-start));
		
	}

	public static void main(String[] args) {
		
		Test2 ob = new Test2();
		
		ob.stringTime();
		ob.stringBufferTime();
		ob.stringBuilderTime();
		
		
		System.out.println("----------------");
		
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("서울");
		sb.append("부산");
		sb.append("광주");
		
		System.out.println(sb);
		
		String str = sb.toString();
		System.out.println(str);
		
		
		

	}

}
