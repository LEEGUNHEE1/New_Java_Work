package com.day13;

interface InterTest{
	
	public int total();
	public void write();
	
}

class InterTestImpl implements InterTest{
	
	private String hak,name;
	private int kor,eng;
		
	public InterTestImpl(String hak,String name,int kor,int eng) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	//ob1.equals(ob2)
	public boolean equals(Object ob) {//upcast
		
		boolean flag = false;
		
		if(ob instanceof InterTestImpl) {
			
			InterTestImpl it = (InterTestImpl)ob;//downcast
			
			if(this.name.equals(it.name)&&
					this.hak.equals(it.hak)) {
				flag = true;
			}
			
		}		
		return flag;		
	}
	
	
	@Override
	public int total() {
		return kor+eng;
	}

	@Override
	public void write() {
		System.out.println(hak + "," + name + "," 
				+ total() + "��");
	}
	
}

public class Test8 {

	public static void main(String[] args) {

InterTestImpl ob1 = new InterTestImpl("111", "�����", 80, 90);
InterTestImpl ob2 =	new InterTestImpl("111", "�����", 100, 100);

		
		if(ob1.equals(ob2)) {//Object -> InterTestImpl
			System.out.println("ob1�� ob2�� ���� �ι�..");
		}else {
			System.out.println("ob1�� ob2�� �� ���� �ι�..");
		}
		
		ob1.write();
		ob2.write();
		
	}

}








