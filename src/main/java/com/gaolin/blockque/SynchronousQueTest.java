package com.gaolin.blockque;

import java.util.concurrent.Semaphore;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueTest {

	public static void main(String[] args) {
		
		
		System.out.println("begin--"+System.currentTimeMillis());
		
		final SynchronousQueue<String> q = new SynchronousQueue<String>();
		final Semaphore sem = new Semaphore(1);
		
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {
				
				public void run() {
					try {
						sem.acquire();
						String input = q.take();
						String out = dosome(input);
						System.out.println(Thread.currentThread().getName()+":"+out);
						sem.release();
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					
				}

			
			}).start();
		}
		for (int i = 0; i < 10; i++) {
			
			String input = i+1+"数据";
			try {
				q.put(input);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static String dosome(String input) {
		try {
			Thread.sleep(1000l);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String output = input+":"+System.currentTimeMillis();
		return output;
	}
}
