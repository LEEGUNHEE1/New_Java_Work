package com.day13;

import java.util.Scanner;

abstract class SortInt{
	
	private int[] value;
	
	protected abstract void sorting();//�߻�޼ҵ�
	
	public void sort(int[] value) {
		this.value = value;
		
		sorting();
	}
	
	public int length() {//�迭�� ������ ��ȯ
		if(value==null) {
			return 0;
		}
		
		return value.length;
	}
	
	protected final int compare(int i, int j) {//��
		if(value[i]==value[j]) {
			return 0;
		}else if(value[i]>value[j]) {
			return 1;
		}else {
			return -1;
		}
	}
	
	protected final void swap(int i, int j) {//�ڸ��ٲ�
		int temp;
		temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
	
	public void print() {
		if(value==null) {
			return;
		}
		
		for(int su : value) {
			System.out.printf("%5d",su);
		}
		System.out.println();
	}
	
}

class SortTest extends SortInt{

	@Override
	protected void sorting() {
		
		for(int i=0;i<length()-1;i++) {
			for(int j=i+1;j<length();j++) {
				
				if(compare(i, j)>0) {
					swap(i, j);
				}
				
			}
		}
		
	}	
	
}

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		
		System.out.print("5���� ����?");// 6 5 8 3 2
		
		for(int i=0;i<data.length;i++) {
			data[i] = sc.nextInt();
		}
		
		SortTest ob = new SortTest();
		
		ob.sort(data);//�迭�� �Ѱ���
		ob.print();
		
		
		

	}

}












