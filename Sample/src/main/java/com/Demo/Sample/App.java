package com.Demo.Sample;

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
        SessionFactory s1= config.buildSessionFactory();
        Session session= s1.openSession();
        
        
//               Employee e= new Employee(2, "meena");
        
                    Employee e= new Employee();
//                    e.setId(3);
//                    e.setName("Sameer");
                    
                    e.setName("Hemraj");
                    
                    Transaction t1= session.beginTransaction();
                    
//                    session.save(e);
                    
                    session.persist(e);

                    
                    t1.commit();
                    
         System.out.println("table created and data store....");
    }
}
