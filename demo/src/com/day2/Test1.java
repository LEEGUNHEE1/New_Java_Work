package com.day2;

public class Test1 {

	public static void main(String[] args) {

		int r = 10;
		float area,length;
		
		area = r*r*3.14f;//����
		length = r*2*3.14f;//�ѷ�
		
		System.out.println("������: " + r + ", ����: " + area);
		System.out.printf("������: %d, ����: %.2f\n",r,area);
		System.out.printf("������: %d, ����: %g\n",r,area);
		
		
		int a = 10;
		float b = 6; // �ڵ� ����ȯ
		
		
		System.out.println(a + ":" + b);
		
		a = (int)b;
		
		System.out.println(a + ":" + b);
		
		
		
		
		
		
		
	}

}
