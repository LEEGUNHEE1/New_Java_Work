package com.day12;

//String : �ڷ����� �ƴ� Ŭ����
//������ �������� ���� Ŀ�� Heap������ �����ϰ�
//���󵵴� ���⶧���� �ڷ���ó�� �����
//String�� �Һ��� ��Ģ�� ������
//���ڿ� �񱳴� ==�� �ƴ϶� equals�� ���ؾ��Ѵ�

public class Test1 {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");
		
		System.out.println("ob1==ob2: " + (ob1==ob2));//true
		System.out.println("ob1==ob3: " + (ob1==ob3));//false
		System.out.println("ob1.equals(ob3): " +
				ob1.equals(ob3));//true
		
		ob2 = "korea";
		System.out.println("ob1==ob2: " + (ob1==ob2));//false
		
		ob2 = "Japan";
		System.out.println("ob1==ob2: " + (ob1==ob2));//false
		
		ob2 = "Seoul";
		System.out.println("ob1==ob2: " + (ob1==ob2));//true
		
		
	}

}


























