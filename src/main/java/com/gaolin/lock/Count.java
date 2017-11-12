package com.gaolin.lock;

public class Count {

	private byte[] lock1 = new byte[1];
	private byte[] lock2 = new byte[1];
	
	private int num = 0;
	
	public void add () {
		synchronized (lock1) {
		
			try {
				Thread.sleep(1000l);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (lock2) {
			
				num += 1;
			}
			System.out.println(Thread.currentThread().getName()+"-"+num);
			
		}
	}
	
	public void lockmethod () {
		synchronized (lock2) {
			
			
			try {
				Thread.sleep(1000l);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			synchronized (lock1) {
			
				num+=1;
			}
			System.out.println(Thread.currentThread().getName()+"-"+num);
			
		}
		
	}
	
}
