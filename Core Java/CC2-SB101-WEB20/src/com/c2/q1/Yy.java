package com.c2.q1;

class Yy {
	
	public synchronized void funY(Xx x1){
		System.out.println("funY of Y starts");
		x1.fun1();
		System.out.println("funY of Y ends");
	}

	public synchronized void fun2(){
		System.out.println("inside fun2 of Y");
	}
}
