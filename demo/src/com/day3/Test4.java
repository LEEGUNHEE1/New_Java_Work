package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {
		
		//��� ����
		//���ǹ� : if, if~else, elseif
		//�ݸ� : for, while, do~while
		//switch 
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num=0;
		String str=""; //null
		
		System.out.print("�� �Է�? ");//10
		num = Integer.parseInt(br.readLine());
		
		/*
		//if(���ǽ�){true�϶� �۾�}
		if(num%2==0) {
			str = "¦��";
		}
		
		if(num%2!=0) {
			str = "Ȧ��";
		}
		*/
		
		if(num%2==0) {
			str = "¦��";			
		}else {
			str = "Ȧ��";
		}
			
				
		System.out.println(num + " : " + str);
		
		
		
		
		
		
		
		

	}

}



