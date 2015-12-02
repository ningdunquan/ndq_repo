package com.proxy.java.test;

import java.lang.reflect.Method;

import com.proxy.java.business.AddBusiness;
import com.proxy.java.business.impl.AddBusinessImpl;
import com.proxy.java.handler.NdqInvocationHandler;

public class MainTest {

	public static void main(String[] args) {
		AddBusiness business = new AddBusinessImpl();

		AddBusiness proxyed = (AddBusiness) new NdqInvocationHandler()
				.getProxyed(business);

		// double sum = proxyed.add(12, 31, -14);
		//
		// System.out.println(sum);
		//
		// System.out.println(proxyed.add(11.12, 10.22, 11, 223, -100));

		Method[] methods = proxyed.getClass().getMethods();

		for (Method method : methods) {
			System.out.println(method.getGenericReturnType().getTypeName()
					+ " " + method.getName());
		}
		
		//Ã»ÓÐ°ü
//		System.out.println(proxyed.getClass().getPackage().getName());
		
		System.out.println(proxyed.getClass().getName());
		System.out.println(proxyed.getClass().getSuperclass().getName());

	}
}
