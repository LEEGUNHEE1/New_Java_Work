package com.day17;

class MyThread4 implements Runnable{

	private int bank = 10000;//은행잔고
	
	private int getBank() {//잔액 확인
		return bank;
	}
	
	private int drawMoney(int m) {
		bank=bank-m; //bank-=m; //인출
		return m;	//인출 금액
	}
		
	@Override
	public void run() {
		
		int moneyNeed = 6000;//인출할 금액
		int money; //인출금액
		
		String msg;
		
		try {
			
			synchronized (this) {			
			
				if(getBank()>=moneyNeed) {
					money = drawMoney(moneyNeed);
					msg = "인출 성공!";
				}else {
					money = 0;
					msg = "인출 실패!";
				}
			}
			
		System.out.println(Thread.currentThread().getName() +
				": " + msg + ", 인출 금액: " + money + 
				", 잔액: " + getBank());	
						
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
}

public class Test4 {

	public static void main(String[] args) {
		
		MyThread4 ob = new MyThread4();
		
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);
		Thread t3 = new Thread(ob);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}











