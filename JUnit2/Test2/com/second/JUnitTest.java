package com.second;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTest {

	Junit2 j=new Junit2();
	
	@Test
	void test1() {
		String actual=j.reverse("abcd");
		String expected="dcba";
		System.out.println(actual);
		assertEquals(expected, actual);
	}

	@Test
	void test2() {
		assertEquals(16, j.multiply(4, 3));
	}

}
 