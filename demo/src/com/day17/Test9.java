package com.day17;

import java.io.FileOutputStream;

//FileOutputStream
//파일 생성

public class Test9 {

	public static void main(String[] args) {

		try {
			
			FileOutputStream fos = 
					new FileOutputStream("c:\\doc\\out.txt");
			
			int data;
			System.out.print("문자열 입력:");//abcdefg
			while((data=System.in.read())!=-1) {
				fos.write(data);
				fos.flush();
			}
			
			fos.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}






















