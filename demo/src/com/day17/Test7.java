package com.day17;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//InputStreamReader
//1byte의 문자를 2byte로 변환
//OutputStreamWriter
public class Test7 {

	public static void main(String[] args) throws IOException {
		
		int data;
		System.out.print("문자열?");//abcdefg
		
		Reader rd = new InputStreamReader(System.in);
		Writer wr = new OutputStreamWriter(System.out);
		
		while((data=rd.read())!=-1) {
			//char ch = (char)data;
			//System.out.print(ch);
			
			wr.write(data);
			wr.flush();//생략불가
			
		}
		
		
	}

}
