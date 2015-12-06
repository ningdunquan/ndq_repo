package com.thread.java.threadLocal;

import java.util.Random;


public class ThreadLocalTest {

	private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					int data = new Random().nextInt(100);
					
					threadLocal.set(data);
					System.out.println(Thread.currentThread().getName() + "put : " + data);
					
					new A().get();
					new B().get();
					
				}
			}).start();
		}
	}
	static class A {
		public void get() {
			System.out.println("A get " + Thread.currentThread().getName()
					+ ": " + threadLocal.get());
		}
	}

	static class B {
		public void get() {
			System.out.println("B get " + Thread.currentThread().getName()
					+ ": " + threadLocal.get());
		}
	}

}

