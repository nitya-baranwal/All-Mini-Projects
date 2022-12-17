package com.c2.q3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Object>{
	
	int n;
	
	public MyCallable(int n) {
		this.n = n;
	}
	
	

	@Override
	public Object call() throws Exception {
		
		int p = 1;
		for(int i = 1; i <= n; i++) {
			p*=i;
		}
		return p;
		
	}
	
	

}
