package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {
		//�غ�(width)�� ����(height)�� �Է¹޾� �ﰢ���� ���̸� ���ϱ�
		//�غ�?: 10
		//����?: 20
		//����: 100
		//���� = �غ�x���� / 2

		//����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
				
		int width,height;
		double area;		

		//�Է�
		System.out.print("�غ�?");//40
		width = Integer.parseInt(br.readLine());
		
		System.out.print("����?");//50
		height = Integer.parseInt(br.readLine());

		//����
		area = width * height / 2.0;

		//���

		System.out.println("����: " + area);









	}

}
