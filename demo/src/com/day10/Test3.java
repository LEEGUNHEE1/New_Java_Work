package com.day10;

class Rect{

	private int w,h;
	
	public void setData(int w,int h) {
		this.w = w;
		this.h = h;
	}
	
	public int area() {
		return w*h;
	}
	
	public int length() {
		return (w+h)*2;
	}
	
	public void print(int a, int l) {
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: " + a);
		System.out.println("�ѷ�: " + l);		
	}
	
	//�޼ҵ� �ߺ�����(overloading)
	//�ϳ��� Ŭ���� �ȿ��� 
	//�޼ҵ��� �̸��� ���Ͻ�Ű�� �۾�
	//�μ��� ������ �ٸ��ų� �ڷ����� �ٸ���
	//�ٸ� �޼ҵ�� �ν��� �Ѵ�
	public void print() {
		System.out.println("����: " + w);
		System.out.println("����: " + h);
	}
	
	public void print(int a) {
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: " + a);
	}
	
	public void print(double l) {
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("�ѷ�: " + l);
	}

}


public class Test3 {

	public static void main(String[] args) {

		Rect ob = new Rect();
		
		ob.setData(10, 20);
		int a = ob.area();
		int l = ob.length();
		
		ob.print(l);
		ob.print();
		ob.print(a);
		ob.print(a, l);
		
		
	}

}














