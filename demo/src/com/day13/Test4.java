package com.day13;

//�߻�Ŭ����
//�޸��� ���񰡾��� Ŭ������ �̸� ����
//�޼ҵ带 ������ �ؼ� ����Ѵ�
//�߻�޼ҵ� 1���� �ݵ�� �־�� �Ѵ�
//�Ϲ� �޼ҵ嵵 ����� �ִ�

abstract class ShapeClass{
	
	abstract void draw();
	
	//�Ϲ� �޼ҵ嵵 ��� ����
	public void draw1() {		
	}
	
}

class Circ extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("���� �׸���...");
	}
	
}

class Rect extends ShapeClass{
	
	@Override
	public void draw() {
		System.out.println("�簢���� �׸���...");
	}
	
}

class Tria extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸���...");
	}
	
}

public class Test4 {

	public static void main(String[] args) {
		
		Circ c = new Circ();
		Rect r = new Rect();
		Tria t = new Tria();
		
		c.draw();
		r.draw();
		t.draw();
		

	}

}








