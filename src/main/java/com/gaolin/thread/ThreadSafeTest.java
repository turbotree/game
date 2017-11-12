package com.gaolin.thread;

import com.gaolin.entity.Count;

public class ThreadSafeTest {

	public static void main(String[] args) {
		
		Count count = new Count();
		for (int i = 0; i < 5; i++) {
			Thread4Test t = new Thread4Test(count);
			t.start();
		}
		
	}
	
}
