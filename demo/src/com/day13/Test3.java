package com.day13;

//final
//������ ����ϸ� �� �ѹ��� �ʱ�ȭ�� ����
//�޼ҵ忡 ����ϸ� Override�� �Ұ���
//Ŭ������ ����ϸ� ����� �Ұ���

//final class TestA{
class TestA{
	
	public static final double PI;
	
	static {
		PI = 3.14;
	}

	public double area;
	
	public final void write(String title) {
		System.out.println(title + ":" + area);
	}
	
}

public class Test3 extends TestA{

	//@Override
	//public void write(String title) {}
	
	public void circleArea(int r) {
		area = r*r*PI;
	}
	
	public static void main(String[] args) {

		Test3 ob = new Test3();
		
		ob.circleArea(10);
		ob.write("��");
		
		
		
	}

}






