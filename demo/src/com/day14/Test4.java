package com.day14;

//4.����Ŭ����(������,�͸���,anonymous Ŭ����)
public class Test4 {
	
	public Object getTitle() {
		
		//�ڵ�
		
		return new Object() {
			
			@Override
			public String toString() {
				//�ڵ�
				return "�͸��� Ŭ����";
			}
			
		};
	}

	public static void main(String[] args) {
		
		Test4 ob = new Test4();
		System.out.println(ob.getTitle());
		
		//String str = (String)ob.getTitle();
		//System.out.println(str);
		
		
		
		
		

	}

}
