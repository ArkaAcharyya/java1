package com.Capg.spring.classbased;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfig.class);
		
		People people=context.getBean(People.class);
		
		Bike bike= context.getBean(Bike.class);
		
		PojoClass pojoClass= context.getBean(PojoClass.class);
		//Bike bike1= context.getBean(hero);
		
		System.out.println(people);
		System.out.println(bike);
		System.out.println(pojoClass);
		List.of(10,20,30);
		//System.out.println(bike1);
	}
}
