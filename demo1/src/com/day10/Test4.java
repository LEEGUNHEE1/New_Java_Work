package com.day10;

//������
//�޸� �Ҵ��� ������ ���
//���� �ʱ�ȭ �������� ���
//�����ڴ� Class�� �̸��� ����
//���ϰ��� ���⶧���� property�� ����
//�ߺ�����(overload)�� �����ϴ�
//������ �ȿ��� �ٸ� �����ڸ� ȣ���Ҽ��ִ�
//��,���� ���ο��� �ѹ��� ȣ���� �����ϴ�

public class Test4 {
	
	private int x;
	
	public Test4() {//�⺻������
		
		//this(50);
		
		System.out.println("�⺻ ������");
		x=10;
		
		System.out.println("x: " + x);
		
	}
	
	public Test4(int x) {
		
		this();
		System.out.println("�����ε� ������");
		this.x = x;
		System.out.println("x: " + this.x);
	}
	
	public static void main(String[] args) {

		Test4 ob = new Test4();
		Test4 ob1 = new Test4(100);
		
		
	}

}








