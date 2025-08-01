package com.day17;
//데몬스레드
//다른스레드에 도움을 주는 스레드로 
//메인스레드가 종료가 되면 프로세스가 종료 된다

class MyThread2 implements Runnable{

	@Override
	public void run() {
		
		for(int i=1;i<=20;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
			
		}
		
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println("main 시작...");
		
		Thread t1 = new Thread(new MyThread2());
		Thread t2 = new Thread(new MyThread2());
		Thread t3 = new Thread(new MyThread2());
		
		//데몬스레드
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		//메인이 1초 쉼
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		
		//다른스레드가 종료할때까지 기다려
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("main 종료...");

	}

}













