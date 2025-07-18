package com.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {
		
		//주민번호 검사
		
		//index : 01234567890123
		//jumin : 941010-2053128
		//check : 234567 892345
		
		//합 = (9*2)+(4*3)+...+(2*5)
		//합 = 11-(합%11)
		//합 = 합%10
		//합 == 8
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
				
		String jumin;
		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
		int i,tot,su;
		
		System.out.print("주민번호?[xxxxxx-xxxxxxx]");
		jumin = br.readLine();
		
		if(jumin.length()!=14) {
			System.out.println("입력 오류!!");
			return;//stop
		}
		
		//index : 01234567890123
		//jumin : 941010-2053128
		//chk   : 234567 892345
		
		tot = 0;
		
		for(i=0;i<12;i++) {
			
			if(i>=6) { //뒷자리
	tot += chk[i]*Integer.parseInt(jumin.substring(i+1, i+2));			
			}else { //생년월일
	tot += chk[i]*Integer.parseInt(jumin.substring(i, i+1));
			}		
			
		}
		
		//합 = 11-(합%11)
		//합 = 합%10
		su = 11 - tot % 11;
		su = su % 10;
		
		if(su==Integer.parseInt(jumin.substring(13))) {
			System.out.println("정확한 주민번호!!");
		}else {
			System.out.println("틀린 주민번호!!");
		}
		
		
		
		/*
		String str = "seoul korea";
		//index       01234567890
		
		System.out.println(str.substring(0, 3));//seo
		System.out.println(str.substring(6, 8));//ko
		System.out.println(str.substring(6));
		*/
		

	}//main

}//Test5
