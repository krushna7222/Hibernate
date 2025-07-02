package com.org;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration config = new Configuration().configure();
        
        SessionFactory factory = config.buildSessionFactory();
        
        Session session = factory.openSession();
        
        
        Car c1 = new Car();
        
        c1.setName("BMW");
        c1.setSpeed(200);
        
        Bike b1 = new Bike();
        b1.setName("Royal Enfield");
        b1.setHasgear(true);
        
        session.persist(c1);
        session.persist(b1);
        
         
        Transaction tx = session.beginTransaction();
        tx.commit();
        
        session.close();
        
        System.out.println("Success....");
    }
}
