package com.gaolin.listmaptest;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class MapTest {

	
	public static void main(String[] args) {
		
		
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(3);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
