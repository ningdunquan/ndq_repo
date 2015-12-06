package com.thread.java.test;

public class RunableDecrease implements Runnable {

	private ShareDataOperate operate;
	public RunableDecrease(ShareDataOperate operate) {
		this.operate = operate;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 30; i++) {
			operate.decrease();
		}
	}

}
