package com.day18;

import java.io.Serializable;

public class MyData implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private int score;
	
	public MyData(String name,int score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		
		String str = String.format("%s %d", name,score);
		
		return str;
		
		//return name + " : " + score;
	}
	
	
	
}
