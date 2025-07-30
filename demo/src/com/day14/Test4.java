package com.day14;

//4.내부클래스(무명의,익명의,anonymous 클래스)
public class Test4 {
	
	public Object getTitle() {
		
		//코딩
		
		return new Object() {
			
			@Override
			public String toString() {
				//코딩
				return "익명의 클래스";
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
