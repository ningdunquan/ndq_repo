package com.proxy.java.business.impl;

import com.proxy.java.business.AddBusiness;

public class AddBusinessImpl implements AddBusiness {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public double add(double a, double b) {
		return a + b;
	}

	@Override
	public double add(double... arr) {
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
