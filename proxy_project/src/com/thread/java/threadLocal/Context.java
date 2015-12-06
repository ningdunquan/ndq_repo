package com.thread.java.threadLocal;

public class Context {
	private String name;
	private int number;
	
	private Context() {}
	
	private static ThreadLocal<Context> threadLocal = new ThreadLocal<Context>();
	
	public static Context getThreadInstance() {
		Context intstance = threadLocal.get();
		
		if(intstance == null) {
			intstance = new Context();
			
			threadLocal.set(intstance);
		}
		return intstance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Context [name=" + name + ", number=" + number + "]";
	}
	
}
