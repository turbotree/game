package com.gaolin.thread;

import com.gaolin.entity.Count;

public class Thread4Test extends Thread{

	private Count count;
	
	public Thread4Test(Count count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		count.add();
	}
}
