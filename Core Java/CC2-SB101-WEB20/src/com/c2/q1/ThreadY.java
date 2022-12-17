package com.c2.q1;

class ThreadY extends Thread{
	
	
	Xx x1;
	Yy y1;
	
	public ThreadY(Xx x,Yy y1) {
		this.y1=y1;
		this.x1=x1;
	}
	
	@Override
	public void run() {
		y1.funY(x1);
	}
}
