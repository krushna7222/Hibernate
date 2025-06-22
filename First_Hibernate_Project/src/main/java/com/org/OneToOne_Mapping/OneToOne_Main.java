package com.org.OneToOne_Mapping;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Session    session=new Configuration().configure().buildSessionFactory().openSession();
	      
	        Answer a1= new Answer();
	          a1.setAnsid(11);
	          a1.setAns("java db connectivity");
	       
	        Answer a2= new Answer();
	          a2.setAnsid(12);
	          a2.setAns("object orienetd programming");
	          
	          Answer a3= new Answer();
	          a3.setAnsid(13);
	          a3.setAns("orm tool");
	    //----------------------------------------------------
	          
	          Question q1=new Question();
	             q1.setQid(1);
	             q1.setQue("what is java?");
	             q1.setAid(a2);
	             
	             Question q2=new Question();
	             q2.setQid(2);
	             q2.setQue("what is hibernate?");
	             q2.setAid(a3);
	             
	             Question q3=new Question();
	             q3.setQid(3);
	             q3.setQue("what is jdbc?");
	             q3.setAid(a1);
	             
	            
	          
	          
	    Transaction tx= session.beginTransaction();
	             session.persist(a1);
	             session.persist(a2);
	             session.persist(a3);
	             session.persist(q1);
	             session.persist(q2);
	             session.persist(q3);
	            
	             
	             tx.commit();
	             
	             session.close();
	           System.out.println("success");

	}

}
