package com.day11;

import java.util.Calendar;

//Call By Value
//stack ������ �����Ͱ� heap�������� �Ѿ

//Call By Reference
//heap ������ �����ʹ� stack�������� �Ѿ�� ���ϰ�
//�ּҸ� �Ѱ� �ش�

class Test{
	
	public int x=10;
	
	public void sub(int a) {
		x+=a;
	}
	
}

public class Test1 {

	public static void main(String[] args) {

		Test ob1 = new Test();
		
		int a = 20;
		
		//Call By Value
		System.out.println("sub()�޼ҵ� ���� �� x : " + ob1.x);
		ob1.sub(a);
		System.out.println("sub()�޼ҵ� ���� �� x : " + ob1.x);
		
		
		//Call By Reference
		Test ob2;
		ob2 = ob1;
		
		System.out.println("ob1.x : " + ob1.x);//30
		System.out.println("ob2.x : " + ob2.x);//30
		
		ob2.x = 100;
		System.out.println("ob1.x : " + ob1.x);//100
		System.out.println("ob2.x : " + ob2.x);//100
		
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		
		
	}

}



