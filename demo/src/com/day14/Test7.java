package com.day14;

import java.util.Vector;

class Test{
	String name;
	int age;
}

public class Test7 {

	public static void main(String[] args) {
		
Vector<Test> v = new Vector<Test>();

Test ob;
ob = new Test();
ob.name = "홍길동";
ob.age = 20;
v.add(ob);

ob = new Test();
ob.name = "배수지";
ob.age = 20;
v.add(ob);

for(Test t : v) {
	System.out.println(t.name + ":" + t.age);
}
		
		
		

	}

}





