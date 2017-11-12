package com.gaolin.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinTask;

public class SingleThreadPool {

	private static ExecutorService executor = Executors.newSingleThreadExecutor();
	
	
	
	public static void main(String[] args) {
		executor.submit(new Runnable() {
			
			public void run() {
				System.out.println("我在工作");
				
			}
		});
		
		
	}
	
	
}
