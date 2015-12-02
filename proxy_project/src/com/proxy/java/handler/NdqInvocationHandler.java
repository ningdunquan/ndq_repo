package com.proxy.java.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class NdqInvocationHandler implements InvocationHandler {

	private Object proxyed;

	public Object getProxyed(Object proxyed) {
		this.proxyed = proxyed;

		return Proxy.newProxyInstance(proxyed.getClass().getClassLoader(),
				proxyed.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		doBeforeAction();
		
		Object val = method.invoke(proxyed, args);
		
		doAfterAction();
		
		return val;
	}

	private void doAfterAction() {
		System.out.println("doAfterAction¡­¡­");
	}

	private void doBeforeAction() {
		System.out.println("doBeforeAction¡­¡­");
	}

}
