package com.day13;

//Interface
//�߻�Ŭ������ �������� �����ְ� ���ǰ�����
//final������ �����Ҽ��ִ�
//�������̽��� �����ϱ����ؼ��� implements�� ����Ѵ�
//�ϳ��̻��� �������̽��� ������ Ŭ������ ��� �޼ҵ带
//������ �ؾ��Ѵ�
//�������̽��� �������̽��� ��� ������������ �̶���
//extends�� ����Ѵ�
//Ŭ�����ʹ� �ٸ��� ���� ������ �����ϴ�

interface Fruit{
	
	String Won = "��"; //public static final����
	
	int getPrice();		//public abstract
	public String getName();
	
}

class FruitImpl implements Fruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "���";
	}
	
	
	public String getItem() {
		return "����";
	}
	
}

public class Test7{

	public static void main(String[] args) {
		
		FruitImpl ob1 = new FruitImpl();//upcast�� ��ü�� ����
		
		System.out.println(ob1.getItem());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1; //upcast
		
		System.out.println(ob2.getName());//���
		
		//4.�ڽĲ��� �ڽĲ���
		//System.out.println(ob2.getItem());
		

	}

}




















