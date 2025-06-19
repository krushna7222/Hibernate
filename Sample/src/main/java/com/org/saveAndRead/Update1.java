package com.org.saveAndRead;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Configuration config = new Configuration().configure();
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Employee e1 = new Employee();
		
		e1.setId(1);
		e1.setName("Satish");
		e1.setSalary(253647.02);
		
//		session.update(e1);
		session.merge(e1);
		
		Transaction tx = session.beginTransaction();
		
		tx.commit();
		
		session.close();
	
		System.out.println("Successfull....");
		

	}

}
