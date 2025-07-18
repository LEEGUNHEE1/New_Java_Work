package com.day16;

//Generic

class Box<T>{
	
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		
		Box b1 = new Box();
		b1.set(30);//upcast
		Integer i = (Integer)b1.get();//downcast
		System.out.println(i);
		
		
		Box<Integer> b2 = new Box<Integer>();
		b2.set(new Integer(10));
		//b2.set("서울");
		Integer ii = b2.get();
		System.out.println(ii);
		
		Box<String> b3 = new Box<String>();
		b3.set("서울");
		//b3.add(10);
		String str = b3.get();
		System.out.println(str);
		

	}

}






















