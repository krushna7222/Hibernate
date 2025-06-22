package com.org.manyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee e1 = new Employee();
		
		e1.setEid(11);
		e1.setEname("Sachin Purkar");
		
		
		Employee e2 = new Employee();
		
		e2.setEid(12);
		e2.setEname("Hemraj Raut");
		
		Employee e3 = new Employee();
		
		e3.setEid(13);
		e3.setEname("Vishal Pagere");
		
//		-------------------
		
		Project p1 = new Project();
		
		p1.setPid(101);
		p1.setPname("Quize App");
		
		Project p2 = new Project();
		
		p2.setPid(102);
		p2.setPname("Chat Bot");
		
		
		Project p3 = new Project();
		
		p3.setPid(103);
		p3.setPname("E-Commerce");
		
//		-------------------------
		
		
		List<Employee> elist1 = new ArrayList<Employee>();
		elist1.add(e1);
		elist1.add(e3);
		
		List<Employee> elist2 = new ArrayList<Employee>();
		elist2.add(e2);
		elist2.add(e3);
		
		List<Employee> elist3 = new ArrayList<Employee>();
		elist2.add(e2);
		elist2.add(e1);
		
		
		
		
		
		p1.setEmps(elist1);
		p2.setEmps(elist2);
		p3.setEmps(elist3);
		
		
	
//		--------------------
		
		
		List<Project> plist1 = new ArrayList<Project>();
		plist1.add(p1);
		plist1.add(p2);
		
		List<Project> plist2 = new ArrayList<Project>();
		plist2.add(p3);
		plist2.add(p2);
		
		List<Project> plist3 = new ArrayList<Project>();
		plist3.add(p1);
		plist3.add(p2);
		
		
		e1.setProjects(plist1);
		e2.setProjects(plist2);
		e3.setProjects(plist3);
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		session.persist(p1);
		session.persist(p2);
		session.persist(p3);
		
		tx.commit();
		
		session.close();
		
		System.out.println("Success....");

	}

}
