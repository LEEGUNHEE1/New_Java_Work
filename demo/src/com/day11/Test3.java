package com.day11;

//��� (�θ� �ڽ����� �ִ°�)
//1. �θ𲨴� �ڽĲ���.
//2. private�� �����Ѱ��� ����� �ȵȴ�
//3. protected�� �����Ѱ��� ����� ����
//4. �ڽĲ��� �ڽĲ���
//5. �θ�� �ڽ��� ���� ��ü�� ������ ������
//   ������ ����Ѵ�

class TestB{
	
	private String title;
	protected int area;
	
	public void set(String title) {
		this.title = title;		
	}
	
	public void print() {
		System.out.println(title + " : " + area);
	}
	
}

class RectB extends TestB{
	
	private int w,h;//10,5
	
	public RectB(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		
		area = w*h;//3. protected�� �����Ѱ��� ����� ����
		//int a = area;
		
		set("�簢��");//1. �θ𲨴� �ڽĲ���.
		
	}
}

public class Test3 {

	public static void main(String[] args) {
		
		RectB ob = new RectB(10, 5);
		
		ob.rectArea();
		ob.print();//1. �θ𲨴� �ڽĲ���.
		

	}

}






















