package com.c2.q3;

import java.util.concurrent.Callable;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		MyCallable[] tasks = {
				
				new MyCallable(3),
				new MyCallable(5),
				new MyCallable(4),
				new MyCallable(2),
				new MyCallable(7),
				new MyCallable(10),
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
	    for(MyCallable task : tasks) {
	    	Future future = service.submit(task);
	    	System.out.println(future.get());
	    }
	}
}
