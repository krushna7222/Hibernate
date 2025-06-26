package com.org;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration config = new Configuration().configure();
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        
        Department d1 = new Department();
        		d1.setDeptName("Software Development");
        
        Employee e1 = new Employee();
        		e1.setName("Mahesh Patil");
        		e1.setDepartment(d1);
        		
        Employee e2 = new Employee();
        		e2.setName("Sachin Purkar");
        		e2.setDepartment(d1);
        		
        Employee e3 = new Employee();
        		e3.setName("Umesh Shinde");
        		e3.setDepartment(d1);
        		
        List<Employee> emplist = new ArrayList<Employee>();
        				emplist.add(e1);
        				emplist.add(e2);
        				emplist.add(e3);
        				
        				d1.setEmployee(emplist);
        				
        session.persist(d1);
        
        
        
        Department d2 = new Department();
		d2.setDeptName("Testing");

		Employee e4 = new Employee();
				e4.setName("Gitesh Shewale");
				e4.setDepartment(d2);
				
		Employee e5 = new Employee();
				e5.setName("Hitesh Mahale");
				e5.setDepartment(d1);
				
	
				
		List<Employee> emplist2 = new ArrayList<Employee>();
						emplist.add(e4);
						emplist.add(e5);
						
						d1.setEmployee(emplist2);
						
				        session.persist(d2);

        				
        Transaction tx = session.beginTransaction();
        
        tx.commit();
        
        session.close();
        
        System.out.println("Success...");
    }
}
