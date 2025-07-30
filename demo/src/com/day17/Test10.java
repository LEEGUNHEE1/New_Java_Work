package com.day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

		//원본파일? c:\\doc\\test.txt
		//대상파일? c:\\doc\\test1.txt
		//복사완료!
		
		Scanner sc = new Scanner(System.in);
		String str1,str2;
		int data;
		
		try {
			
			System.out.print("원본파일?");
			str1 = sc.next();
			
			System.out.print("대상파일?");
			str2 = sc.next();
			
			FileInputStream fis = 
					new FileInputStream(str1);
			FileOutputStream fos = 
					new FileOutputStream(str2);
			
			while((data=fis.read())!=-1) {
				fos.write(data);
				fos.flush();
			}
			
			System.out.println("복사 완료!");
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
		
		
		
	}

}




























