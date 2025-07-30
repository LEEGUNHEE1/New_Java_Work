package com.score2;

import java.io.FileNotFoundException;

public interface Score {
	
	public void input();//입력
	
	public void print();//출력

	public void deleteHak();//삭제
	
	public void searchHak();//학번검색
	
	public void searchName();//이름검색
	
	public void descSortTot();//총점내림차순정렬

	public void ascSortHak();//학번오름차순정렬
	
	public void memorySave() throws Exception;
	

	
	
	
	

}