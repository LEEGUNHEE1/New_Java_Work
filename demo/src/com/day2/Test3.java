package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {

	public static void main(String[] args) throws IOException {

		//����ڿ��� �̸�,����,���������� �Է¹޾�
		//�̸��� ������ ���
		
		//����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		String name;//�̸�
		int kor,eng;
		int tot;
		
		
		//�Է�
		System.out.print("�̸�?");//suzi
		name = br.readLine();
		
		System.out.print("����?");//70
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("����?");//50
		eng = Integer.parseInt(br.readLine());
		
				
		//����
		tot = kor + eng;
		
		//���
		System.out.printf("�̸�: %s, ����: %d, ����: %d, ����: %d",
				name,kor,eng,tot);
		
	}

}













