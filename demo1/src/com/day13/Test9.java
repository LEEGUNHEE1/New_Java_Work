package com.day13;

import java.util.Scanner;

interface FruitA{
	
	String Won = "��";
	
	public int getPrice();
	public String getName();
	
}

interface ItemFruit extends FruitA{
	
	public String getItems();
	
}

class Orange implements ItemFruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "������";
	}

	@Override
	public String getItems() {
		return "����";
	}
	
}

class Apple implements ItemFruit{

	@Override
	public int getPrice() {
		return 2000;
	}

	@Override
	public String getName() {
		return "���";
	}

	@Override
	public String getItems() {
		return "����";
	}	
	
}

public class Test9 {

	public void packing(ItemFruit ob) {
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Test9 t = new Test9();
		
		System.out.print("1.������ 2.���?");//1
		int ch = sc.nextInt();
		
		if(ch==1) {
			t.packing(new Orange());
		}else if(ch==2) {
			t.packing(new Apple());
		}
		
		/*
		ItemFruit ob;
		
		ob = new Orange();		
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
		
		ob = new Apple();
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
		*/
		
		/*
		 ItemFruit ob;
		 ob = new Orange();		 
		 ob = new Apple();
		  
		 ItemFruit ob = new Orange();
		 ItemFruit ob = new Apple();
		 
		 Orange ob1 = new Orange();
		 Apple ob2 = new Apple();
		 
		 int a;
		 a = 10;
		 System.out.println(a);10
		 
		 a = 20;
		 System.out.println(a);20
		 
		 */
		
		

	}

}
























