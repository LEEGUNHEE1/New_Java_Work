package com.day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		//�̸��� 3������ ������ �Է¹޾� ���� ���ǿ� ���� ���
		//��� ������ ������ 40�� �̻��̰� ����� 60�� �̻��̸� �հ�
		//�Ѱ����̶� 40�� �̸��̰� ����� 60�� �̻��̸� ����
		//����� 60�� �̸��̸� ���հ�
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor,eng,mat,tot,avg;
		String pan="";
		
		System.out.print("�̸�?");//suzi
		name = sc.next();
		
		System.out.print("�������� ����?");//50 60 70
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		tot = kor+eng+mat;
		avg = tot/3;
		
		//�̸��� 3������ ������ �Է¹޾� ���� ���ǿ� ���� ���
		//��� ������ ������ 40�� �̻��̰� ����� 60�� �̻��̸� �հ�
		//�Ѱ����̶� 40�� �̸��̰� ����� 60�� �̻��̸� ����
		//����� 60�� �̸��̸� ���հ�
		
		if(kor>=40 && eng>=40 && mat>=40 && avg>=60) {
			pan = "�հ�";
		}else if(avg>=60) {
			pan = "����";
		}else {
			pan = "���հ�";
		}
				
		
		System.out.println("�̸�: " + name);
		System.out.println("����: " + tot + "��");
		System.out.println("���: " + avg + "��");
		System.out.println("����: " + pan);

	}

}































