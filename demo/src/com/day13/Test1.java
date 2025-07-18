package com.day13;

class Test{
	
	protected int a=10,b=20;
			
	public void write() {
		System.out.println("SuperClass write()...");
		System.out.println("a: " + a + ",b: " + b);//10,20
		//System.out.println(c);
	}
	
}

class Demo extends Test{
	
	protected int b=30,c=40;
	
	@Override
	public void write() {
		System.out.println("SubClass write()...");
		System.out.println("a: " + a + ",b: " + b + ",c: " + c);
		System.out.println("super.b: " + super.b);
	}
	
	public void print1() {
		System.out.println("SubClass print1()...");
		write();
	}
	
	public void print2() {
		System.out.println("SubClass print2()...");
		super.write();
	}	
	
}

public class Test1 {

	public static void main(String[] args) {

		Demo ob = new Demo();
		
		ob.write();
		System.out.println("--------");
		ob.print1();
		System.out.println("--------");
		ob.print2();
		System.out.println("--------");
		
		System.out.println("ob.b: " + ob.b);//30
		//upcast
		System.out.println("((Test)ob).b: " + ((Test)ob).b);//20
		
		//upcast
		//�޼ҵ�� ������ �ٸ��� �ڽ��� �޼ҵ带 ����ϰ� �Ѵ�
		//�޼ҵ�� heap�����̾ƴ� �޼ҵ� �������ֱ⶧����
		//������ �Ұ��ϴ�
		((Test)ob).write();
		
		/*
		int a = 10;
		double b;
		
		b = a; 			�Ͻ�������ȯ(O)
		b = (double)a; 	����� ����ȯ(O)
		
		a = b;		(X)
		a = (int)b	(O)
		-----------------------------------
		�θ�(d) - �ڽ�(i)
		
		�θ� = �ڽ�;		upcast(O)
		�θ� = (�θ�)�ڽ�;	upcast(O)
		
		�ڽ� = �θ�	(X)
		�ڽ� = (�ڽ�)�θ� (O)	downcast
		
		
		
		
		*/
		
		
	}

}
