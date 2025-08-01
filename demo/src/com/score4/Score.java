package com.score4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Score {
	
	private List<ScoreVO> lists;
	
	//c:\\java\\work\\demo
	private String path = System.getProperty("user.dir");	
	File f = new File(path,"\\data\\score.txt");
	
	@SuppressWarnings("unchecked")
	public Score() {
		
		try {
			
			if(!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}
			
			if(f.exists()) {//score.txt
				
				FileInputStream fis = 
						new FileInputStream(f);
				ObjectInputStream ois =
						new ObjectInputStream(fis);
				
				lists = (List<ScoreVO>)ois.readObject();
				
				fis.close();
				ois.close();
			}			
			
		} catch (Exception e) {
			
		}
		
	}	
	
	public void input() {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			ScoreVO vo = new ScoreVO();
			
			System.out.print("이름?");
			vo.setName(sc.next());
			
			System.out.print("생일?");
			vo.setBirth(sc.next());
			
			System.out.print("점수?");
			vo.setScore(sc.nextInt());
			
			if(lists==null) {
				lists = new ArrayList<ScoreVO>();
			}
			
			lists.add(vo);
			
		} catch (Exception e) {
			
		}	
		
	}
	
	public void print() {
		
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo.toString());
		}	
		
	}
	
	public void writeFile() {
		
		try {
			
			if(lists!=null) {
				
				FileOutputStream fos = 
						new FileOutputStream(f);
				ObjectOutputStream oos = 
						new ObjectOutputStream(fos);
				
				oos.writeObject(lists);
				
				fos.close();
				oos.close();
				System.out.println("파일 저장 성공!!");
			}
			
			
		} catch (Exception e) {
			
		}
		
		
		
		
	}
	

}








