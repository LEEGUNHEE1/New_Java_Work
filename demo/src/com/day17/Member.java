package com.day17;

import java.util.Random;
import java.util.Scanner;

class MyThread extends Thread{
	
	int cnt = 0;
	
	@Override
	public void run() {
		
		while(true) {
			
			System.out.print(".");
			
			try {
				sleep(300);
				
				if(cnt==20) {
					break;
				}
				
				cnt++;
				
			} catch (Exception e) {
				
			}
			
			
		}
		
	}
	
}

public class Member {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		Thread ob = new MyThread();
		
		int[] num;
		int inwon,i,n;
		
		String[] name = 
			{"������","������","������","������","����ȣ",
			"�����","������","��ҿ�","����ȯ","�̰���",
			"�ֹξ�","����Ź","�ѵ���","Ȳ�μ�","�ڼ���",
			"ȫ����"}; 	
		
		do {
			System.out.print("��ǥ�� �ο���[�ִ�" +
					name.length + "��]?");
			inwon = sc.nextInt();
		}while(inwon<1||inwon>name.length);
		
		num = new int[inwon];
		
		n=0;
		while(n<inwon) {
			
			num[n] = rd.nextInt(name.length);
			
			for(i=0;i<n;i++) {
				if(num[i]==num[n]) {
					n--;
					break;
				}
			}
			n++;			
		}
		
		System.out.print("������");
		
		ob.start();
		
		try {
			ob.join();
		} catch (Exception e) {
			
		}
		
		System.out.println("\n");
		System.out.println("�����մϴ�!!, ��ǥ�� �Դϴ�.");
				
		int cnt=1;
		for(int su : num) {
			System.out.printf("%d�� ��ǥ��: %5s\n",cnt,name[su]);
			cnt++;
		}
		
		
	}

}






















