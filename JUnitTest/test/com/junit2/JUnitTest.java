package com.junit2;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.Junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class JUnitTest {
    
	Junit ju = new Junit();
	@Test
	void test() {
		//Junit ju = new Junit();
		int actual = ju.add(6, 7);
		System.out.println(ju==ju);
		int expected = 48;
		assertEquals(expected, actual);
	}
	@Test
	void divTest(){
		assertThrows(ArithmeticException.class, ()->{ju.divide(5,0);});
		
	}
	@Test
	void arrayTest() {
		try {
			int[] arr=null;
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer handled");
		}
	}

}
