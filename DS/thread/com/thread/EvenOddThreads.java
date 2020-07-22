package com.thread;

public class EvenOddThreads {
int num =0;
final int MAX=20;
static boolean odd;
	public static void main(String[] args) {
		odd=true;
		EvenOddThreads e=new EvenOddThreads();
		Thread teven=new Thread(new Runnable(){
				@Override
				public void run(){
					e.printEven();
				}
		}
				);
		Thread t2=new Thread(new Runnable(){
			@Override
			public void run(){
				e.printOdd();
			}
		});
		
	}
	protected void printOdd() {
		
		synchronized(this){
			while(num<=MAX){
				while (!odd){
					try{
						wait();
					}
					catch(InterruptedException ie){
						ie.printStackTrace();
					}
				}
				System.out.println("odd value :  "+num);
				odd=false;
				num++;
				notify();
			}
				
			}
		}
	
	protected void printEven() {
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		
		synchronized(this){
		while(num<=MAX){
			
			
				while(odd){
					try{
					wait();
					}
					catch(InterruptedException ie){
						ie.printStackTrace();
					}
					
				}
				System.out.println(" value of count"+num);
				num++;
				odd=true;
				notify();
			}
		}
	}
	}

