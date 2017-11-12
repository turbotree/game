package com.gaolin.thread;

public class ThreadLocalClient extends Thread{

	private ThreadLocalTest test;
	public ThreadLocalClient(ThreadLocalTest test) {
		this.test =test;
	}
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			//每个线程打印3个序列值
			System.out.println("thread"+Thread.currentThread().getName()+"-->sn"+test.getNetNum());
		}
		test.getThreadLocal().remove();
	}
}
