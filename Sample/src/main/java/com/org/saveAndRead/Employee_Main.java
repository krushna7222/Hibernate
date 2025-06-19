package com.org.saveAndRead;

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
		
		Employee e1 = new Employee();
				e1.setName("Hemraj");
				e1.setSalary(298547.00);
				
		Employee e2 = new Employee();
				e2.setName("Sachin");
				e2.setSalary(328547.00);
				
		session.persist(e1);
		session.persist(e2);
		
		Transaction tx = session.beginTransaction();
		
		tx.commit();
		
		Employee emp = session.get(Employee.class, 3);
		
		if (emp != null) {
			System.out.println("Id = "+emp.getId()+", Name = "+emp.getName()+", Salary = "+emp.getSalary());
		}else {
			System.out.println("Record Is Null....");
		}
		
		Employee emp2 = session.get(Employee.class, 4);
		
		if (emp2 != null) {
			System.out.println("Id = "+emp2.getId()+", Name = "+emp2.getName()+", Salary = "+emp2.getSalary());
		}else {
			System.out.println("Record Is Null....");
		}
		
		session.close();
		
		System.out.println("Record Fetched Successfully...");

	}

}
