package com.c2.q1;

//Deadlock is a condition which occurs when two threads are waiting for each other
//to get the key of each other lock
//This happens for infinite time and no thread is able to perform task assigned to it
//Deadlock occurs in multi-threaded operation when synchronized keyword is used

//Deadlock can be prevented by removing any one of the synchronized keyword


public class Demo{
	
	public static void main(String[] args) {
		
		Xx x1 = new Xx();
		Yy y1 = new Yy();
		ThreadX t1 = new ThreadX(x1, y1);
		ThreadY t2 = new ThreadY(x1, y1);
		t1.start();
		t2.start();
		
	}
}