package com.gaolin.thread;

import java.util.concurrent.Callable;

public class Thread3 implements Callable<String>{

	public String call() throws Exception {
		System.out.println("callable实现线程");
		return "Thread3";
	}

}
