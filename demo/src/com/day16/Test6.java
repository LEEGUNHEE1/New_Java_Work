package com.day16;

class MyException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public MyException(String msg) {
		super(msg);
	}
	
}

public class Test6 {

	private int value;
	
	public void setValue(int value) throws MyException{
		
		if(value<0) {
			throw new MyException("수는 0보다 작을수 없다");
		}else {
			this.value = value;				
		}
	}
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {

		Test6 ob = new Test6();
		
		try {
			
			ob.setValue(-20);
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println(ob.getValue());
	}

}




