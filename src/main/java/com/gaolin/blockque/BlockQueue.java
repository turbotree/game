package com.gaolin.blockque;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class BlockQueue {

	public static void main(String[] args) throws Exception {
		
		final long start = System.currentTimeMillis();
		//模拟有16个日志，用4个线程在4s内打印结束
		 final ArrayBlockingQueue<String> bq = new ArrayBlockingQueue<String>(16);
		//模拟16个日志
		 for (int i = 0; i < 16; i++) {
			bq.put(i+1+"-->");
		}
		 
		 for (int i = 0; i < 4; i++) {
			
			 new Thread(new Runnable() {
				
				public void run() {
					while (true) {
						try {
							String log = bq.take();
							
							printLog(log);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
						
					}
					
				}

				
			}).start();
		}
		
		
	}
	public static void printLog(String log) {
		System.out.println(log+System.currentTimeMillis());
		try {
			Thread.sleep(1000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
