package com.day10;


class RectA{
	
	private int w,h;
	
	public RectA() {}
	
	public RectA(int w, int h) {//�����ε��� ������
		this.w = w;
		this.h = h;
	}	
	
	public void setData(int w,int h) {//���� �ʱ�ȭ �޼ҵ�
		this.w = w;
		this.h = h;
	}
	
	public int area() {
		return w*h;
	}
	
	public int length() {
		return (w+h)*2;
	}
	
	public void print() {
		System.out.println("����: " + w);
		System.out.println("����: " + h);
	}
	
	//�����ε��� �޼ҵ�
	public void print(int a, int l) {
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: " + a);
		System.out.println("�ѷ�: " + l);
	}
	
}


public class Test5 {

	public static void main(String[] args) {

				
		RectA ob = new RectA();//�⺻ ������
		ob.setData(10, 20);
		int a = ob.area();
		int l = ob.length();
		ob.print();
		ob.print(a, l);
		
		System.out.println("-------------");
		
		RectA ob1 = new RectA(100, 200);//�����ε��� ������
		a = ob1.area();
		l = ob1.length();
		ob1.print();
		ob1.print(a, l);
		
		ob1.setData(11, 22);
		a = ob1.area();
		l = ob1.length();
		ob1.print();
		ob1.print(a, l);
		
		
		
		
	}

}




























