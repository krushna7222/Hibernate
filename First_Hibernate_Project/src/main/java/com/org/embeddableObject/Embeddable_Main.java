package com.org.embeddableObject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embeddable_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		/*
         * Configuration cfg = new Configuration(); 
         * cfg.configure();
         * 
         * 
         * SessionFactory factory= cfg.buildSessionFactory();
         * 
         * Session session = factory.openSession();
         */
        
        //or
        
//        Session session= new Configuration().configure().buildSessionFactory().openSession();
		
		
		 Configuration config = new Configuration();
		 			   config.configure();
		 SessionFactory factory = config.buildSessionFactory();
		 Session session = factory.openSession();
		 
		 Certificate ct = new Certificate();
		 
		 			ct.setCourse("Java FullStack");
		 			ct.setDuration("11 Months");
		 			
		 Stud1 st = new Stud1();
		 		
		 		st.setId(1);
		 		st.setName("Krushna Shahane");
		 		st.setCity("Nashik");
		 		st.setCerti(ct);
		 		
		 Transaction tx = session.beginTransaction();
		 
		 session.persist(st);
		 
		 tx.commit();
		 
		 session.close();
		 factory.close();
		 
		 System.out.println("Table is Created and Data Was Inserted....");

	}

}
