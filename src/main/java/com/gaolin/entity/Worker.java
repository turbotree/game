package com.gaolin.entity;

import java.util.Map;
import java.util.Queue;

public class Worker implements Runnable{

	 protected Queue<Object> workQueue;//从master那里获得的工作加工队列
	    protected Map<String,Object> resultMap;
	    public void setWorkQueue(Queue<Object> workQueue) {
	        this.workQueue=workQueue;
	    }
	    public void setResultMap(Map<String,Object> resultMap){
	        this.resultMap=resultMap;
	    }

	    /**
	     * 留给子类实现的方法
	     * @param input
	     * @return
	     */
	    public Object handle(Object input) {
	        return input;
	    }

	    public void run() {
	        while(true) {
	            Object input=workQueue.poll();
	            if(input==null) break;
	            Object re=handle(input);
	            resultMap.put(Integer.toString(input.hashCode()),re);
	        }
	    }
}
