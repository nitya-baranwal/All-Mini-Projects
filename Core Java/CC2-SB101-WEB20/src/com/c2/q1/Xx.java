package com.c2.q1;

class Xx {
	
	public synchronized void funX(Yy y1){
		System.out.println("funX of X starts");
		y1.fun2();
		System.out.println("funX of X ends");
	}
	public synchronized void fun1(){
		System.out.println("inside fun1 of X");
	}
}
