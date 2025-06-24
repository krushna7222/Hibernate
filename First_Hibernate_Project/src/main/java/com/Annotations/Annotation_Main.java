package com.Annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Annotation_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Configuration config = new Configuration();
		 	config.configure();
	        SessionFactory s1= config.buildSessionFactory();
	        Session session= s1.openSession();
	        
	        
	        
	                    Student stud1= new Student(11,"Hemraj",76.25);
	                    Student stud2= new Student(12,"Sachin",69.25);
	                    Student stud3= new Student(13,"Rohit",65.14);
	                    Student stud4= new Student(14,"Mahesh",82.25);

	                    
	                
	                    
	                    Transaction t1= session.beginTransaction();
	                    
//	                    session.save(stud1);
	                    
	                    session.persist(stud1);
	                    session.persist(stud2);
	                    session.persist(stud3);
	                    session.persist(stud4);

	                    
	                    t1.commit();
	                    
	                    session.close();
	                    s1.close();
	                    
	         System.out.println("table created and data store....");

	}

}
