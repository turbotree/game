package com.gaolin.lock;

public class ThreadA extends Thread{
private Count count;

public ThreadA(Count count) {
	this.count  = count;
}

	@Override
	public void run() {
		count.add();
	}
}
