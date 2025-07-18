package com.day11;

import java.util.Calendar;

//Call By Value
//stack 영역의 데이터가 heap영역으로 넘어감

//Call By Reference
//heap 영역의 데이터는 stack영역으로 넘어가지 못하고
//주소를 넘겨 준다

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
		System.out.println("sub()메소드 실행 전 x : " + ob1.x);
		ob1.sub(a);
		System.out.println("sub()메소드 실행 후 x : " + ob1.x);
		
		
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



