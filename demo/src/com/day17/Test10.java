package com.day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

		//��������? c:\\doc\\test.txt
		//�������? c:\\doc\\test1.txt
		//����Ϸ�!
		
		Scanner sc = new Scanner(System.in);
		String str1,str2;
		int data;
		
		try {
			
			System.out.print("��������?");
			str1 = sc.next();
			
			System.out.print("�������?");
			str2 = sc.next();
			
			FileInputStream fis = 
					new FileInputStream(str1);
			FileOutputStream fos = 
					new FileOutputStream(str2);
			
			while((data=fis.read())!=-1) {
				fos.write(data);
				fos.flush();
			}
			
			System.out.println("���� �Ϸ�!");
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
		
		
		
	}

}




























