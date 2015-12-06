package com.thread.java.test;

public class ShareDataOperate {

	private int data = 20;
	
	public synchronized void increase() {
		notify();
		
		data ++;
		System.out.println(Thread.currentThread().getName() + "增加一至：" + data);
		
		try {
			wait();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	
	public synchronized void decrease() {
		notify();
		
		data --;
		System.out.println(Thread.currentThread().getName() + "减少一至：" + data);
		
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
