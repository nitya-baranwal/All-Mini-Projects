package com.c2.q2;

public class ThreadA extends Thread{

	int prod = 1;
	
	@Override
	public void run() {
		System.out.println("Inside the threadA");
		
		
		synchronized (this) {
			for(int i = 1; i<=10; i++) {
				prod*=i;
			}
			this.notify();
			
			
			System.out.println("ThreadA has notified the main thread");
		}
	}

}
