package com.org.secondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLevelCache_Main {

	public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        
        //second level cache does not fire select query in multiple sessions....
        //for all sessions in a one factory,it will fire select query only once
    
        Session session1 = factory.openSession();
         Book b1 = session1.get(Book.class, 104);   //q
            System.out.println(b1);
            
         Book b2 = session1.get(Book.class, 104);
            System.out.println(b2);
         
            session1.close();
          
         System.out.println("--------first Session Closed--------: ");       //first session closed
            
            System.out.println("\n--------Second Session started--------: ");
            //second session started
        Session session2= factory.openSession();
             Book b3 = session2.get(Book.class, 104); //here,hibernate does not fire select query again..even though we are in second session..because,here we are using second level cache
             System.out.println(b3);
             
                  Book b4 = session2.get(Book.class, 104); //here,hibernate does not fire select query again..even though we are in second session..because,here we are using second level cache
             System.out.println(b4);
             
             Book b5 = session2.get(Book.class, 104); //here,hibernate does not fire select query again..even though we are in second session..because,here we are using second level cache
             System.out.println(b5);
         
         session2.close();
         
         System.out.println("-----third session started---");
         Session session3= factory.openSession();
         Book b7 = session3.get(Book.class, 104); //here,hibernate does not fire select query again..even though we are in second session..because,here we are using second level cache
         System.out.println(b7);
    
    }

}
