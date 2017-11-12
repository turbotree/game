package com.gaolin.thread;

public class Thread1 extends Thread{

	private String tName;
	public Thread1() {
		
	}
	public Thread1(String name) {
		this.tName = name;
	}
	@Override
	public void run() {

		
		super.run();
		
		try {
			Thread.sleep(1000l);
			
			System.out.println(tName+Thread.currentThread().getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
