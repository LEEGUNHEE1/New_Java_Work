package com.day14;

//����Ŭ����(��ø)
//Ŭ�����ȿ� static Ŭ������ ����� �ִ�
class Outer3{
	
	static int a = 10;
	int b = 20;
	
	public static class Inner3{
		
		int c = 30;
		
		public void write() {
			System.out.println(a);
			//System.out.println(b);
			System.out.println(c);
			
		}
		
	}
	
	public void print() {
		Inner3 in = new Inner3();
		in.write();
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		Outer3 out = new Outer3();
		out.print();
	}

}






