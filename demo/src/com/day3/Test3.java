package com.day3;

import java.io.IOException;

public class Test3 {

	public static void main(String[] args)throws IOException {
		
		char ch,result;
		
		System.out.print("�Ѱ��� ����: ");//a(97)
		ch = (char)System.in.read();
		
		result = ch>=65 && ch<=90?(char)(ch+32):
			(ch>='a' && ch<='z'?(char)(ch-32):ch);
		
		System.out.println(ch + "->" + result);
				
		
		/*
		char a = 'a';
		char b = '��';
		
		System.out.println(a);//a
		System.out.println(Integer.toString(a));//97
		*/

	}

}
