package com.day17;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//File
//파일및 폴더를 관리하는 클래스
//파일의 정보를 제공해주지만
//파일을 만들거나 내용을 수정할 수는 없다
public class Test13 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("c:\\doc\\test.txt");
		
		if(!f.exists()) {
			System.out.println("파일이 없다");
			return;
		}
		
		System.out.println("파일명: " + f.getName());
		System.out.println("파일길이: " + f.length() + "bytes");
		System.out.println("파일경로: " + f.getAbsolutePath());
		System.out.println("표준경로: " + f.getCanonicalPath());
		System.out.println("만든날: " + new Date(f.lastModified()));
		System.out.println("폴더경로: " + f.getParent());
		System.out.println("읽기속성: " + f.canRead());
		System.out.println("쓰기속성: " + f.canWrite());
		
		
		//현재 프로젝트 경로
		String path = System.getProperty("user.dir");
		System.out.println("프로젝트 경로: " + path);

	}

}
