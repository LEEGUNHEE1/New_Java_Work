package com.day10;

//static
//��ü�� 100�� �����ǵ� �޸� ������ 1���� ���
//��ü�� �������� �ʾƵ� �޸𸮻� �ö� �ִ�

public class Test1 {
	
	public static int a = 10; //Class����	
	//Ŭ��������,�Ǵ� Ŭ���� �޼ҵ�� �ε��Ǵ� ����
	//�޸� �Ҵ��� �̷������ [Ŭ�����̸�.��ü]���� 
	//���� �����ϴ� ��,new�� ���� �޸� �Ҵ��� ���� �ʾƵ� 
	//����� �����ϴ�
	
	private int b = 20; //Instance ����
	//�ν��Ͻ� ���� �Ǵ� �ν��Ͻ� �޼ҵ�� new�� ���� ��ü��
	//�����ϰ� ��ü�� ���ؼ��� ������ �����ϴ�
	//�ν��Ͻ� ������ ���� Ŭ������ �޼ҵ忡���� �ٷ� 
	//������ ���������� Ŭ���� �޼ҵ忡���� �����Ҽ� ����

	public void write() {//Instance �޼ҵ�
		
		System.out.println("class ���� a :" + a);
		System.out.println("instance ���� b: " + b);		
		
	}
	
	public static void print() {//class �޼ҵ�
		
		System.out.println("class ���� a :" + a);
		//System.out.println("instance ���� b: " + b);
		
	}

	public static void main(String[] args) {

		System.out.println("class���� a : " + a);
		System.out.println("class���� a : " + Test1.a);
		
		//System.out.println(b);
		//write();
		
		print();
		Test1.print();
		
		Test1 ob = new Test1();
		
		System.out.println(ob.b);
		ob.write();
		
		System.out.println(ob.a);
		ob.print();
		
		System.out.println("-------------------");
		
		Test1 ob1 = new Test1();
		ob1.a = 100;
		ob1.b = 200;
		
		ob1.write();
		
		ob.write();
		
		Test1 ob2 = new Test1();
		
		ob2.a = 300;
		ob2.b = 50;
		
		ob.write();
		ob1.write();
		ob2.write();
		
	}

}



























