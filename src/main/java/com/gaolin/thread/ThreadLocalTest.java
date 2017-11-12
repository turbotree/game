package com.gaolin.thread;

public class ThreadLocalTest {

	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
		
		protected Integer initialValue() {
			return 0;
		};
	};
	public ThreadLocal<Integer> getThreadLocal() {
		return seqNum;
	}
	
	public static void main(String[] args) {
		
		
		ThreadLocalTest test = new ThreadLocalTest();
		
		ThreadLocalClient c1 = new ThreadLocalClient(test);
		ThreadLocalClient c2 = new ThreadLocalClient(test);
		ThreadLocalClient c3 = new ThreadLocalClient(test);
		c1.start();
		c2.start();
		c3.start();
		
	}

	public int getNetNum() {
		seqNum.set(seqNum.get()+1);
		return seqNum.get();
	}
}
