package com.org.saveAndRead;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config = new Configuration().configure();
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Employee e1 = session.get(Employee.class,2);
		
			e1.setName("Sanjay");
			
			Transaction tx = session.beginTransaction();
			
			tx.commit();
			
			session.close();
		
			System.out.println("Successfull....");

	}

}
