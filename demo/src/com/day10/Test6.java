package com.day10;

public class Test6 {
	
	int a = 5;
	
	//�ʱ�ȭ ��
	//��ü�� �����Ǹ� ������ �ѹ� �����
	{
		System.out.println("�ʱ�ȭ �� a : " + a);
		a = 10;
		System.out.println("�ʱ�ȭ �� a : " + a);
	}
		
	static int b; //Ŭ���� ����
	//static ��
	//��ü�� �������� �ʾƵ� ������ �ѹ� �����
	static {
		b = 10;
		System.out.println("static �� b : " + b);
	}
	
	//���:���α׷��� ����ɶ� �ݵ�� �ʱ�ȭ �ؾߵǰ� 
	//���������� ���� ������ �����Ҽ� ����
	final int C;
	
	public Test6() {
		System.out.println("������...");
		C = 100;
		System.out.println("C : " + C);
	}

	public static void main(String[] args) {

		Test6 ob = new Test6();
		Test6 ob1 = new Test6();
		
	}

}








