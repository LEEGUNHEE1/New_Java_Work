package com.day4;

import java.util.Scanner;

//Scanner
//�ܶ������� ������ ����� �з��ϴ� �۾�
//�⺻ ������ ����
public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor,eng,mat;
		
		System.out.print("�̸� ���� ���� ����?");//���� 50 60 70
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		System.out.println("�̸�: " + name + " : " 
				+ "����: " + (kor+eng+mat) + "��");
		
		
		
	}

}



