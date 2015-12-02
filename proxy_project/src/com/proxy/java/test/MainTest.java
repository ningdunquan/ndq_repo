package com.proxy.java.test;

import com.proxy.java.business.AddBusiness;
import com.proxy.java.business.impl.AddBusinessImpl;
import com.proxy.java.handler.NdqInvocationHandler;

public class MainTest {

	public static void main(String[] args) {
		AddBusiness business = new AddBusinessImpl();
		
		AddBusiness proxyed = (AddBusiness) new NdqInvocationHandler().getProxyed(business);
		
		double sum = proxyed.add(12, 31, -14);
		
		System.out.println(sum);
		
		System.out.println(proxyed.add(11, 10));
	}
}
