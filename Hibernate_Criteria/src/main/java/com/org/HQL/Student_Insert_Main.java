package com.org.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Student_Insert_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
            Student3 l1=new Student3(101, "Sanjay", "Mumbai", 99);
            Student3 l2=new Student3(102, "Mahesh", "Satara", 93);
            Student3 l3=new Student3(103, "Sachin", "Nashik", 84);
            Student3 l4=new Student3(104, "Karan", "Lasalgoan", 68);
            Student3 l5=new Student3(105, "Sameer", "Niphad", 57);
            Student3 l6=new Student3(106, "Vishal", "Pune", 75);
            Student3 l7=new Student3(107, "Hemraj", "Surgana", 55);
            Student3 l8=new Student3(108, "Abhishek", "Ghoti", 62);
            
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
