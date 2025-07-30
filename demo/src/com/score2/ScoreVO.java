package com.score2;

import java.io.Serializable;

public class ScoreVO implements Serializable{// Value Object

	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	
	public int getTot() {
		return kor + eng + mat;
	}
	//getter,setter
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	//toString
	//������Ʈ �޼ҵ� toString�� �������̵��Ѵ��� ����Ʈ�Ҷ� �޼ҵ� �̸��� ȣ����ϰ� 
	//Ŭ���� �̸��� ȣ���ص� toString�� �ڵ� ȣ���
	@Override
	public String toString() {
		String str = String.format("%5s %6s %3d %3d %3d %3d %3d\n",hak,name,kor,eng,mat,
				getTot(),getTot()/3);
		return str;
	}


}