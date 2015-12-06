package com.thread.java.test;

public class RunableIncrease implements Runnable {

	private ShareDataOperate operate;
	public RunableIncrease(ShareDataOperate operate) {
		this.operate = operate;
	}
	@Override
	public void run() {
		for(int i = 0; i < 30; i++) {
			operate.increase();
		}
	}

}
