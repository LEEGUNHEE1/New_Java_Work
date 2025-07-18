package com.day14;

import java.util.Vector;

//Collection Framework
//List(I) - ArrayList(C),Vector(C) 
//Map(I) - HashMap(C),HashTable(C)
public class Test5 {

	public static void main(String[] args) {
		
		Vector v = new Vector();//Object
		
		v.add("¼­¿ï");//upcast
		v.add(30);
		v.add('a');
		
		String str;
		Integer i;
		char c;
		
		str = (String)v.get(0);//downcast
		System.out.println(str);
		
		i = (Integer)v.get(1);
		System.out.println(i.toString());
		
		c = (char)v.get(2);
		System.out.println(c);
		
		
		for(i=0;i<v.size();i++) {
			
			System.out.print(v.get(i) + " ");
			
		}
		System.out.println();
		
		
		for(Object o : v) {
			
			if(o instanceof String) {
				str = (String)o;
				System.out.println(str);
			}else if(o instanceof Integer) {
				i = (Integer)o;
				System.out.println(i);
			}else if(o instanceof Character) {
				c = (char)o;
				System.out.println(c);
			}
			
		}
		
		
		
		
		

	}

}


























