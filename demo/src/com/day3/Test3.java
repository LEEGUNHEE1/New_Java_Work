package com.day3;

import java.io.IOException;

public class Test3 {

	public static void main(String[] args)throws IOException {
		
		char ch,result;
		
		System.out.print("한개의 문자: ");//a(97)
		ch = (char)System.in.read();
		
		result = ch>=65 && ch<=90?(char)(ch+32):
			(ch>='a' && ch<='z'?(char)(ch-32):ch);
		
		System.out.println(ch + "->" + result);
				
		
		/*
		char a = 'a';
		char b = '강';
		
		System.out.println(a);//a
		System.out.println(Integer.toString(a));//97
		*/

	}

}
