package com.day11;

//��� (�θ� �ڽ����� �ִ°�)
//1. �θ𲨴� �ڽĲ���.
//2. private�� �����Ѱ��� ����� �ȵȴ�
//3. protected�� �����Ѱ��� ����� ����
//4. �ڽĲ��� �ڽĲ���
//5. �θ�� �ڽ��� ���� ��ü�� ������ ������
//   ������ ����Ѵ�

class TestA{
	
	private String title;//�簢��
	private int area;//50
	
	public void set(String title, int area) {
		this.title = title;
		this.area = area;
	}
	
	public void print() {
		System.out.println(title + " : " + area);
	}
	
}

class RectA extends TestA{
	
	private int w,h;//10,5
	
	//public RectA() {}
	
	public RectA(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		
		int a = w*h;
		
		set("�簢��", a);//1. �θ𲨴� �ڽĲ���.
		
	}
}

public class Test2 {

	public static void main(String[] args) {
		
		RectA ob = new RectA(10, 5);
		
		ob.rectArea();
		ob.print();//1. �θ𲨴� �ڽĲ���.
		

	}

}






















