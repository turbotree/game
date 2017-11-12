package com.gaolin.thread;

public class Thread2 implements Runnable{

	private String name;
	public Thread2(String name) {
		this.name = name;
	}
	
	public void run() {
		try {
			Thread.sleep(5000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String threadName = Thread.currentThread().getName();
		System.out.println("线程名称:"+threadName);
		System.out.println(threadName+"的活动线程:"+Thread.activeCount());
		System.out.println(threadName+"优先级："+Thread.currentThread().getPriority());
		System.out.println(threadName+"的状态:"+Thread.currentThread().getState());
		System.out.println(threadName+"的所属线程组:"+Thread.currentThread().getThreadGroup());
		System.out.println(threadName+"是否还活着:"+Thread.currentThread().isAlive());
		System.out.println(threadName+"是否是守护线程:"+Thread.currentThread().isDaemon());
		
	}

}
