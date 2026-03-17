package com.jpa_map.jpa_mp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("MyPU");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        
        et.begin();
        Customer c=new Customer(1,"Ali");
        Customer_details cd= new Customer_details(101,"9966","ali@gmail.com","Kolkata");
        c.setCustomer_Details(cd);
        em.persist(c);
        em.persist(cd);
        et.commit();
    }
}
