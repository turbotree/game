package com.gaolin.lock;

public class DeadLockExample {

	public static void main(String[] args) {
		
		
		Count count = new Count();
		
		ThreadA a = new ThreadA(count);
		a.setName("a线程");
		a.start();
		ThreadB b = new ThreadB(count);
		b.setName("b线程");
		b.start();
		
	}
	
}
