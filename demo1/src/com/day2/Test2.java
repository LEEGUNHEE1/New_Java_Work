package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException{
		
		//�����		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		//System.in: Ű���带 ���� 1byte�� �Է� ����
		//InputStreamReader : System.in���� �Է¹��� 1byte��
		//����(String)�� ����ȯ�� ��Ŵ
		//BufferedReader : �Է¹��� ������ ó���ӵ��� ������ ������
		
			
		int r;
		double area,length;
		
		//�Է�
		System.out.print("������? ");//123
		
		r = Integer.parseInt(br.readLine());
		
		//����
		area = r*r*3.14;
		length = r*2*3.14;
		
		
		//���
		System.out.printf("������: %d, ����: %g, �ѷ�: %g",
				r,area,length);
		
		

	}

}
