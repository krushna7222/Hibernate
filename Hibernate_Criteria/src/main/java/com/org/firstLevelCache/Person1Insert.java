package com.org.firstLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Person1Insert {

	public static void main(String[] args) {
        // TODO Auto-generated method stub

        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Person1 p1=new Person1(101, "amit", "jaypur");
        Person1 p2=new Person1(102, "aakash", "mumbai");
        Person1 p3=new Person1(103, "pawan", "nasik");
        Person1 p4=new Person1(104, "kiara", "pune");
        Person1 p5=new Person1(105, "era", "nasik");
        Person1 p6=new Person1(106, "ajit", "pune");
        Person1 p7=new Person1(107, "gita", "nasik");
        Person1 p8=new Person1(108, "pranjal", "mumbai");
        Person1 p9=new Person1(109, "sneha", "sangli");
        Person1 p10=new Person1(110, "sita", "jaypur");
        Person1 p11=new Person1(111, "raj", "sangli");
        Person1 p12=new Person1(112, "disha", "mumbai");
        Person1 p13=new Person1(114, "reena", "nasik");
        Person1 p14=new Person1(115, "prajwal", "mumbai");
        Person1 p15=new Person1(116, "prasad", "sangli");
        Person1 p16=new Person1(113, "seema", "jaypur");
    
    
        Session session = factory.openSession();  //session=>The main runtime interface between a Java application and Hibernate
       session.beginTransaction();
       session.save(p1);                    
       session.save(p2);
       session.save(p3);
       session.save(p4);
       session.save(p5);
       session.save(p6);
       session.save(p7);
       session.save(p8);
       session.save(p9);
       session.save(p10);
       session.save(p11);
       session.save(p12);
       session.save(p13);
       session.save(p14);
       session.save(p15);
       session.save(p16);
       
       session.getTransaction().commit(); 
       
       
       System.out.println("Done");
       
       session.close();
       
     
       factory.close();
    }

}
