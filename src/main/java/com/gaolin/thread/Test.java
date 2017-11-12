package com.gaolin.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {

	
	public static void main(String[] args) {
		System.out.println("这是主线程");
		//继承的方式
		//Thread1 t1 = new Thread1("继承方式实现线程");
		//t1.start();
		
		//实习runnable接口
		Thread2 t2= new Thread2("");
		for (int i = 0; i < 5; i++) {
				
				new Thread(t2,"线程"+i).start();
				
				
		}
		
		Thread m = Thread.currentThread();
		System.out.println("主线程所在组活动线程："+Thread.activeCount());
		//callable接口实现线程
		/*Thread3 t3 = new Thread3();
		FutureTask<String> ft = new FutureTask<String>(t3);
		new Thread(ft).start();
		try {
			System.out.println("得到线程返回结果:"+ft.get());
		} catch (Exception e) {
			e.printStackTrace();
		} */
	}
	
	
	
}
