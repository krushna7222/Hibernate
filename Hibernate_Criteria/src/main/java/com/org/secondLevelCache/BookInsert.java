package com.org.secondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BookInsert {

	public static void main(String[] args) {
        
	    
	    SessionFactory factory=new Configuration().configure().buildSessionFactory();
	    
	    
	            Book p1=new Book(101, "amit", "ganesh");
	            Book p2=new Book(102, "aakash", "phule");
	            Book p3=new Book(103, "m pawan", "ganesh");
	            Book p4=new Book(104, "kiara", "tendulkar");
	            Book p5=new Book(105, "era", "ritchie");
	            Book p6=new Book(106, "ajit", "james");
	            
	            
	            Session session = factory.openSession();  //session=>The main runtime interface between a Java application and Hibernate
	               session.beginTransaction();
	               session.save(p1);                    
	               session.save(p2);
	               session.save(p3);
	               session.save(p4);
	               session.save(p5);
	               session.save(p6);
	        
	               session.getTransaction().commit(); 
	               
	               
	               System.out.println("Done");
	               
	               session.close();
	            
	               
	               factory.close();
	    }


}
