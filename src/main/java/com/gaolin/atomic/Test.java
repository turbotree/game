package com.gaolin.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {

	public static void main(String[] args) {
		AtomicInteger ai = new AtomicInteger(0);
		System.out.println(ai.get());
	}
	
}
