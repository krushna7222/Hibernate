package com.org.fetchingData;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Person_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Session session= new Configuration().configure().buildSessionFactory().openSession();
        
        Transaction tx = session.beginTransaction();
        
        Person p1 = new Person(101,"Hitesh",24);
        Person p2 = new Person(102,"Sameer",21);
        Person p3 = new Person(103,"Hemraj",22);
        Person p4 = new Person(104,"Mahesh",32);
        Person p5 = new Person(105,"Chetan",28);
        
        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);
        session.persist(p5);
        
        tx.commit();
        
        session.close();

        System.out.println("Done...");

	}

}
