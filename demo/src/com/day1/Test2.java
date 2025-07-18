package com.day1;

public class Test2 {
	
	public static void main(String[] args) {
		
		//변수
		//메소드이름 정의를 따른다
		//자료형 변수명;
		//custiomInfo,custom_info,custom_Info
		//int:8개의 자료형 중 하나(정수만 저장 가능하다)
		//10,-10,0(약-21억~약21억)
		
		//int num1;
		//int num2;
		//int num1=10; //변수 선언과 동시에 초기화
		
		int num1,num2;
		//System.out.println(num1);
		
		//변수 초기화
		//equal 하나는 대입연산자
		num1 = 10;
		num2 = 3;
		
		int num3,num4;//쓰레기값이 들어있다
		
		num3 = num1 + num2;
		num4 = num1 - num2;
		
		System.out.println(num1);//10
		System.out.println(num2);//3
		
		//System.out.println(num3);//쓰레기값은 출력 불가
		
		System.out.println(num3);//13
		System.out.println(num4);//7
		
		System.out.println("-----------");
		
		System.out.println(num1 + "+" + num2 + "=" + num3);
		System.out.println(num1 + "-" + num2 + "=" + num4);
		
		System.out.printf("%d + %d = %d%n",num1,num2,num3);
		System.out.printf("%d-%d=%d\n",num1,num2,num4);
		
		//num1 = 10.5; --X
		
		
		
		
		
	}
	

}
