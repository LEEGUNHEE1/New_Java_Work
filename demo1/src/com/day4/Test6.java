package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {
					
		//1�������� ����ڰ� �Է��� ���ڱ����� ��
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int su,sum;
		char ch;
		
		while(true) { //���ѷ���
			
			do {
				System.out.print("���ϴ� ��[1~5000]: ");//100e
				su = Integer.parseInt(br.readLine());				
			}while(su<1||su>5000);
			
			//1-5000������ ���� �Է� ������
			
			sum=0;
			for(int i=1;i<=su;i++) {
				
				sum = sum + i; //sum+=i
				
			}
			
			System.out.println("1~" + su + "������ ��: " + sum);
			
			//��� ���� ����?
			
			System.out.print("����ҷ�?[Y/N]");//e(1013)
			ch = (char)System.in.read();
			
			if(ch!='Y'&&ch!='y') {				
				System.out.println("���α׷��� �����մϴ�");
				break;
							
				//while,do~while,for,switch
			}		
			
			System.in.skip(2);//enter(10,13)
			
		}

	}//end..main

}//end..class









