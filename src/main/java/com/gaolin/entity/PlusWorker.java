package com.gaolin.entity;

public class PlusWorker extends Worker{

	//三次方
    public Object handle(Object input) {
        int i=(Integer) input;
        return i*i*i;
    }
}
