package com.org;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config = new Configuration().configure();
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		DOJ d1 = new DOJ();
		d1.setDate(11);
		d1.setMonth("November");
		d1.setYear(2023);
		
		DOJ d2 = new DOJ();
		d2.setDate(21);
		d2.setMonth("March");
		d2.setYear(2025);
		
		Employee e1 = new Employee();
				e1.setName("Hemraj");
				e1.setSalary(298547.00);
				e1.setDojb(d1);
				
		Employee e2 = new Employee();
				e2.setName("Sachin");
				e2.setSalary(328547.00);
				e2.setDojb(d2);
				
		session.persist(e1);
		session.persist(e2);
		
		Transaction tx = session.beginTransaction();
		
		tx.commit();
		
		
		session.close();
		
		System.out.println("Record Inserted Successfully...");

	}

}
