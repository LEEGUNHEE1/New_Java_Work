package com.day11;

class SuperTest{
	
	private String title;//��
	protected double area;//314.....200
	
	public SuperTest() {}
	
	public SuperTest(String title) {
		this.title = title;
	}
	
	public void write() {
		System.out.println(title + ":" + area);
	}
	
}

class Circle extends SuperTest{
		
	private int r;//10
	protected static final double PI = 3.14;
	
	public Circle(int r) {
		super("��");//�θ��� �����ε��� ������ ã�ư�
		this.r = r;
	}
	
	public void circleArea() {
		area = r*r*PI;
	}
	
}

class Rec extends SuperTest{
	
	private int w,h;//10,20
	
	public void rectArea(int w, int h) {
		this.w = w;
		this.h = h;
		
		area = this.w*this.h;//200
	}

	//�޼ҵ� Override
	//��Ӱ��迡�� �ϴ����� ����� �޼ҵ��� �̸��� 
	//���Ͻ�Ű�� �۾� 
	@Override //annotation
	public void write() {
		System.out.println("����:" + w);
		System.out.println("����:" + h);
		System.out.println("����:" + area);
	}
	
}


public class Test6 {

	public static void main(String[] args) {
		
		Circle ob1 = new Circle(10);
		ob1.circleArea();
		ob1.write();
		
		Rec ob2 = new Rec();
		ob2.rectArea(10, 20);
		ob2.write();
		
		//5. �θ�� �ڽ��� ���� ��ü�� ������ ������
		//   ������ ����Ѵ�

	}

}









