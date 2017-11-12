package com.gaolin.test;

import java.util.Map;
import java.util.Set;

import com.gaolin.entity.Master;
import com.gaolin.entity.PlusWorker;

public class MasterWorker {

	
	 public static void main(String[] args) {
	        Master master=new Master(new PlusWorker(),4);
	        for(int i=1;i<=100;i++) {
	            //添加1，因为工作队列等会会从这里去加工对象，
	            //假如加工对象是一头猪，那就传入一头猪
	            master.submit(i);
	        }
	        //开始加工
	        master.execute();

	        Map<String,Object> resultMap=master.getResultMap();
	        int re=0;
	        while(true) {
	            Set<String> keys =resultMap.keySet();//获得工作队列中的所有key组
	            String key=null;
	            //取出第一个key 这里的写法 可以防止出现null的情况
	            for(String k:keys) {
	                key=k;
	                break;
	            }
	            Integer i = null;
	            if(key != null)
	                i = (Integer)resultMap.get(key);//根据key取i
	            if(i != null)
	                re += i; //最终结果
	            if(key != null)
	                resultMap.remove(key); //移除已被计算过的项目
	            //isComplete 函数 每次都去遍历工作队列把 完成的去掉
	            if(master.isComplete() && resultMap.size()==0)
	                break;
	        }
	        System.out.println(re);
	    }
}
