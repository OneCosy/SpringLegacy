package com.bit.aop.test2;

public class CalculatorImp implements Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		int c = a+b;
		return c;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		int c= a-b;
		return c;
	}
    

}
