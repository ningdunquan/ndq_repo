package com.thread.java.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ThreadTest {

//	private static int data = 0;
	private static Map<Thread, Integer> map = new HashMap<Thread, Integer>();

	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					map.put(Thread.currentThread(), new Random().nextInt(100));
					System.out.println(Thread.currentThread().getName() + "put : " + map.get(Thread.currentThread()));
						
					new A().get();
					new B().get();
				}
			}).start();
		}
	}

	static class A {
		public void get() {
			System.out.println("A get " + Thread.currentThread().getName()
					+ ": " + map.get(Thread.currentThread()));
		}
	}

	static class B {
		public void get() {
			System.out.println("B get " + Thread.currentThread().getName()
					+ ": " + map.get(Thread.currentThread()));
		}
	}
}
