package com.junit;

public class Junit {
	public int add(int a, int b) {
		return a+b*a;
	}
	public int divide(int a,int b) {
		if(b==0) {
			throw new ArithmeticException("Divison by zero not allowed");
		}
		return a/b;
	}
}
