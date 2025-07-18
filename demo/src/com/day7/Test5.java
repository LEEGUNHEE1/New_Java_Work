package com.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {
		
		//�ֹι�ȣ �˻�
		
		//index : 01234567890123
		//jumin : 941010-2053128
		//check : 234567 892345
		
		//�� = (9*2)+(4*3)+...+(2*5)
		//�� = 11-(��%11)
		//�� = ��%10
		//�� == 8
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
				
		String jumin;
		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
		int i,tot,su;
		
		System.out.print("�ֹι�ȣ?[xxxxxx-xxxxxxx]");
		jumin = br.readLine();
		
		if(jumin.length()!=14) {
			System.out.println("�Է� ����!!");
			return;//stop
		}
		
		//index : 01234567890123
		//jumin : 941010-2053128
		//chk   : 234567 892345
		
		tot = 0;
		
		for(i=0;i<12;i++) {
			
			if(i>=6) { //���ڸ�
	tot += chk[i]*Integer.parseInt(jumin.substring(i+1, i+2));			
			}else { //�������
	tot += chk[i]*Integer.parseInt(jumin.substring(i, i+1));
			}		
			
		}
		
		//�� = 11-(��%11)
		//�� = ��%10
		su = 11 - tot % 11;
		su = su % 10;
		
		if(su==Integer.parseInt(jumin.substring(13))) {
			System.out.println("��Ȯ�� �ֹι�ȣ!!");
		}else {
			System.out.println("Ʋ�� �ֹι�ȣ!!");
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
