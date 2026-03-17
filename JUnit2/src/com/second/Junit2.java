package com.second;

public class Junit2 {
	public String reverse(String str) {
		int n=str.length();
		char[] cArr = str.toCharArray();
		int s=0,e=n-1;
		while(s<e) {
			char temp=cArr[s];
			cArr[s++]=cArr[e];
			cArr[e--]=temp;
		}
		return new String(cArr);
	}
	public int multiply(int a,int b) {
		return a*b;
	}
}
