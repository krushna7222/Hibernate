package com.org.criteriaAPI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert_Main {

		public static void main(String[] args) {
	        
	        
		    
	        SessionFactory factory=new Configuration().configure().buildSessionFactory();
	        
	            Laptop l1=new Laptop(101, "hp", 89000.00);
	            Laptop l2=new Laptop(102, "dell", 78000.25);
	            Laptop l3=new Laptop(103, "lenovo", 65000.36);
	            Laptop l4=new Laptop(104, "accer", 60000.52);
	            Laptop l5=new Laptop(105, "apple", 99000.63);
	            Laptop l6=new Laptop(106, "mt", 78000.52);
	            Laptop l7=new Laptop(107, "abc", 58000.78);
	            Laptop l8=new Laptop(108, "xyz", 75000.14);
	            
	            Session session = factory.openSession();  //session=>The main runtime interface between a Java application and Hibernate
	               
	            session.beginTransaction();
	               session.persist(l1);                    
	               session.persist(l2);
	               session.persist(l3);
	               session.persist(l4);
	               session.persist(l5);
	               session.persist(l6);
	               session.persist(l7);
	               session.persist(l8);
	               
	              Transaction tx = session.getTransaction();
	               tx.commit(); 
	               
	               
	               System.out.println("Done");
	               
	               session.close();
	               
	              
	               factory.close();
	    

	}

}
