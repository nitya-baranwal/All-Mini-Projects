package com.c2.q4;

public class Demo {
	public static void main(String[] args) {
		
		
		Kohli kohli = new Kohli();
		Dhoni dhoni = new Dhoni();
		Rohit rohit = new Rohit();
		
		kohli.setName("Kohli");
		dhoni.setName("Dhoni");
		rohit.setName("Rohit");
		
		
		kohli.setPriority(2);
		dhoni.setPriority(10);
		rohit.setPriority(4);
		
		kohli.start();
		dhoni.start();
		rohit.start();
		
	}
}


class Kohli extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName() + " thread " + i);
		}
	}
}


class Dhoni extends Thread{
	
	@Override
	public void run() {
		int sum = 0;
		for(int i = 1; i<=20; i++) {
			sum+=i;
		}
		System.out.println(Thread.currentThread().getName() + " thread " + sum);
	}
}



class Rohit extends Thread{

	@Override
	public void run() {
		int prod = 1;
		for(int i = 1; i<=10; i++) {
			prod*=i;
		}
		System.out.println(Thread.currentThread().getName() + " thread " + prod);
	}
}
