package com.c2.q1;

class ThreadX extends Thread{
	Xx x1;
	Yy y1;
	
	public ThreadX(Xx x1,Yy y1) {
	this.y1=y1;
	this.x1=x1;
	}
	@Override
	public void run() {
	x1.funX(y1);
	}
}
