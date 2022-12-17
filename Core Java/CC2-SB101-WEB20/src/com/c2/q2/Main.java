package com.c2.q2;

public class Main {
	
	
	public static void main(String[] args) throws Exception {
		
		ThreadA ta = new ThreadA();
		
		Thread t = new Thread(ta);
		
		t.start();
		
		System.out.println("Thread A has started");
		
		synchronized (t) {
			t.wait();
			System.out.println("Main thread has been notified");
			
		}
		int result = ta.prod;
		
		System.out.println("Product of first ten natural numbers is " + result);
		
		
		
	}
}
