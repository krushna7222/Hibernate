package com.org;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration config = new Configuration().configure();
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        
        Passport ps = new Passport();
        		ps.setPassportNumber("KRU2003SHA7222LAX");
        		
        Person p1 = new Person();
        		p1.setName("Krushna Shahane");
        		p1.setPassport(ps);
        		
        		session.persist(p1);
        
        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();
    }
}
