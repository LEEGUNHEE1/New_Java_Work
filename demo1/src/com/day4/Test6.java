package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {
					
		//1에서부터 사용자가 입력한 숫자까지의 합
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int su,sum;
		char ch;
		
		while(true) { //무한루프
			
			do {
				System.out.print("원하는 수[1~5000]: ");//100e
				su = Integer.parseInt(br.readLine());				
			}while(su<1||su>5000);
			
			//1-5000사이의 값을 입력 했을때
			
			sum=0;
			for(int i=1;i<=su;i++) {
				
				sum = sum + i; //sum+=i
				
			}
			
			System.out.println("1~" + su + "까지의 합: " + sum);
			
			//계속 할지 여부?
			
			System.out.print("계속할래?[Y/N]");//e(1013)
			ch = (char)System.in.read();
			
			if(ch!='Y'&&ch!='y') {				
				System.out.println("프로그램을 종료합니다");
				break;
							
				//while,do~while,for,switch
			}		
			
			System.in.skip(2);//enter(10,13)
			
		}

	}//end..main

}//end..class









