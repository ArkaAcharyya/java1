package com.Capg.spring.classbased;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PojoClass {
	@Autowired
	private Bike bike;
	@Autowired
	private People people;
//	@Override
//	public String toString() {
//		return "PojoClass [bike=" + bike + ", people=" + people + "]";
//	}
	@Autowired
	private List<Integer> people1;
	@Override
	public String toString() {
		return "PojoClass [bike=" + bike + ", people=" + people + "]";
	}
	
	
	
	
}
