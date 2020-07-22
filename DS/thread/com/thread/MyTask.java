package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyTask implements Callable<String> {
        private String s="Hello World";
	public MyTask(String s){
		this.s=s;
	}
	
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return s + "Ashish     Pandey";
	}
	public static void main(String[] args)  {
		MyTask m=new MyTask("Hello World here i am for fun coding");
		ExecutorService ex=Executors.newFixedThreadPool(4);
		
		Future<String> s=ex.submit(m);
		try {
            System.out.println(s.get() + "  ");
            System.out.println(s.getClass() +"  ");
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error occured while executing the submitted task");
            e.printStackTrace();
        }

        ex.shutdown();

	}

	

}
