package com.jpa.Jpa;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("MyPU");
    	EntityManager em= emf.createEntityManager();
    	EntityTransaction tx=em.getTransaction();
    	tx.begin();
        
//        Employee e1 = new Employee("ABC", "abc@gmail.com", "382917389");
//        Employee e2 = new Employee("PQR", "pqr@gmail.com", "427864238");
//        Employee e3 = new Employee("XYZ", "xyz@gmail.com", "214676471");
//        
//        em.persist(e1);
//        em.persist(e2);
//        em.persist(e3);
    	Query query=em.createQuery("Select e FROM Employee e");
    	List<Employee> list=query.getResultList();
    	for(Employee e:list) {
    		System.out.println(e);
    	}
    	tx.commit();
        
//        tx.commit();
    }
}
