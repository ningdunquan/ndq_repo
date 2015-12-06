package com.thread.java.threadLocal;

import java.util.Random;

public class MainTest {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					Context context = Context.getThreadInstance();
					context.setName("nn" + new Random().nextInt(100));
					context.setNumber(new Random().nextInt(100));
					System.out.println(Thread.currentThread().getName() + "--"
							+ Context.getThreadInstance());

					new A().get();
					new B().get();

				}
			}).start();
		}
	}

	static class A {
		public void get() {
			System.out.println("A from " + Thread.currentThread().getName()
					+ " " + Context.getThreadInstance());
		}
	}

	static class B {
		public void get() {
			System.out.println("B from " + Thread.currentThread().getName()
					+ " " + Context.getThreadInstance());
		}
	}
}
