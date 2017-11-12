package com.gaolin.entity;

public class Count {

	private int num = 0;
	
	public synchronized void add() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		num =num +1;
		System.out.println(Thread.currentThread().getName()+"的num:"+num);
	}
	
	
}
