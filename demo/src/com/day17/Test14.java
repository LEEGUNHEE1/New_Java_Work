package com.day17;

import java.io.File;
import java.io.FileOutputStream;

public class Test14 {

	public static void main(String[] args) {
		
		String path = "c:\\doc\\java\\temp\\test.txt";
		
		File f = new File(path);
		
		if(!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
		}
		
		try {
			
			FileOutputStream fos = 
					new FileOutputStream(path);
			
			int data;
			System.out.println("���ڿ�?");
			while((data=System.in.read())!=-1) {
				fos.write(data);
				fos.flush();
			}
			
			fos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		

	}

}










