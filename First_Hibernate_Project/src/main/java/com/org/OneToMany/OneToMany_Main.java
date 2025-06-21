package com.org.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session= new Configuration().configure().buildSessionFactory().openSession();
		
		Question1 q1 = new Question1();
				  q1.setQuestionId(101);
				  q1.setQuestion1("What is JAVA");
				  
		Answer1 a1 = new Answer1();
				a1.setAnswerId(11);
				a1.setAnswer1("Object Oriented Programming Language");
				a1.setQustion1(q1);
				
		Answer1 a2 = new Answer1();
				a2.setAnswerId(12);
				a2.setAnswer1("Sequred Language");
				a2.setQustion1(q1);
				
		Answer1 a3 = new Answer1();
				a3.setAnswerId(13);
				a3.setAnswer1("Platform Independent");
				a3.setQustion1(q1);
				
		List<Answer1> alist = new ArrayList<Answer1>();
					  alist.add(a1);
					  alist.add(a2);
					  alist.add(a3);
				  
				  q1.setAnswers(alist);
		
		Transaction tx= session.beginTransaction();
		
		session.persist(q1);
		
//		session.persist(a1);
//		session.persist(a2);
//		session.persist(a3);
		
		tx.commit();
		
		session.close();
		
		System.out.println("Success...");


	}

}
