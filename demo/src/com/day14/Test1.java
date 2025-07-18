package com.day14;

//1.����Ŭ����(Inner)
//Ŭ�����ȿ� Ŭ������ ����� �ִ�
class Outer1{
	
	static int a = 10;
	int b = 20;
	
	//Nested Class
	public class Inner1{
		
		int c = 30;
		
		public void write() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
	}
	
	public void print() {
		Inner1 ob = new Inner1();
		ob.write();
	}	
}

public class Test1 {

	public static void main(String[] args) {
		
		//�ܺ�Ŭ���� ��ü�� �����Ǿ��
		//����Ŭ���� ��ü�� ���� �Ҽ��ִ�
		//�ܺ�Ŭ���� ��ü�� �����ƴٰ��ؼ�
		//����Ŭ���� ��ü�� �����Ȱ��� �ƴϴ�
		Outer1 out = new Outer1();
		out.print();
		
		Outer1.Inner1 in = out.new Inner1();
		in.write();

	}

}






