package com.day17;

import java.io.FileInputStream;

//FileInputStream
public class Test8 {

	public static void main(String[] args) {

		try {
			
			FileInputStream fis = 
					new FileInputStream("c:\\doc\\test.txt");
			
			int data;
			while((data=fis.read())!=-1) {
				System.out.write(data);
				System.out.flush();
			}
			
			fis.close();
			
		} catch (Exception e) {
			
		}
		
		
		
	}

}
