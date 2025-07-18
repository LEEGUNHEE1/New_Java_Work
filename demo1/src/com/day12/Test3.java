package com.day12;

//String의 자주 사용하는 메소드
public class Test3 {

	public static void main(String[] args) {

		String s1 = "서울,부산,대구";
		String ss[] = s1.split(",");
		
		for(String s : ss)
			System.out.print(s + " ");
		System.out.println();
		
		String s2 = "seoul";
		String s3 = "SeOuL";
		
		System.out.println(s2.equals(s3));//false
		System.out.println(s2.equalsIgnoreCase(s3));//true
		
		//index :    01234567890
		String s4 = "abc.def.hij";
		System.out.println(s4.indexOf("."));//3
		System.out.println(s4.lastIndexOf("."));//7
		System.out.println(s4.indexOf("def"));//4
		System.out.println(s4.indexOf("x"));//-1
		//if(s4.indexOf("x")!=-1)
		
		String s5 = "우리나라 대한민국 좋은나라 대한민국";
		String s6 = s5.replaceAll("대한", "大韓");
		System.out.println(s6);		
		
		String s7 = "  a  b  c  ";
		System.out.println(s7);//  a  b  c  
		System.out.println(s7.trim());
		System.out.println(s7.replaceAll(" ", ""));
		System.out.println(s7.replaceAll("\\s", ""));
		
		//String str = "abcdefg";		
		char ch = "abcdefg".charAt(2);
		System.out.println(ch);//'c'
		
		System.out.println("abcdefg".startsWith("abc"));//true
		
		System.out.println("abc defg".length());//7
		
		String s8 = "abcdefg";//d:100
		String s9 = "abcfefg";//f:102
		
		//사전식 배열
		System.out.println(s8.compareTo(s9));//-1
		System.out.println(s9.compareTo(s8));//1
		
		
	}

}
