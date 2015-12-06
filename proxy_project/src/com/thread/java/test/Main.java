package com.thread.java.test;

public class Main {

	public static void main(String[] args) {
		ShareDataOperate shareDataOperate = new ShareDataOperate();
		
		RunableIncrease runableIncrease = new RunableIncrease(shareDataOperate);
		RunableDecrease runableDecrease = new RunableDecrease(shareDataOperate);
		
		new Thread(runableIncrease).start();
		new Thread(runableDecrease).start();
	}
}
