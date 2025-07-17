package com.org.firstLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FirstLevelCache_Main {
	
public static void main(String[] args) {
        
        //First level cache is enabled by default and this type of cache is enabled for one
        //To enabled second level cache we have to add "hibernate" ehcache dependency in pom.xml file

        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        Session session1= factory.openSession();
        
          Person1 p1 =session1.get(Person1.class, 102);    
           System.out.println(p1);
        
          
           Person1 p2 =session1.get(Person1.class, 102);    
           System.out.println(p2);
           
          
           Person1 p3 =session1.get(Person1.class, 102);    
           System.out.println(p3);
           
            session1.close();
           System.out.println("----session1 is closed");
           
           System.out.println("----session2 is open");
           Session session2= factory.openSession();
              
              Person1  p4= session2.get(Person1.class, 102);
               System.out.println(p4);
           
               Person1  p5= session2.get(Person1.class, 102);
               System.out.println(p5);
              
               session2.close();
               
               System.out.println("----session2 is closed");
               
               System.out.println("----session3 is open");
               Session session3= factory.openSession();
               Person1  p6= session3.get(Person1.class, 102);
               System.out.println(p6);
           
           
           
        
        /*
        
    Person1 p1= session1.get(Person1.class, 104);    //here,at the first time of loading data from database..hibernate will store that data into first level cache, and when we load/select the same data again from the db then hibernate will not the the database again
        System.out.println(p1);
        System.out.println("done");
    
    Person1 p2= session1.get(Person1.class, 104); //not fire select query at 2nd time of fetching data from db,it will use/get the data from its cache
        System.out.println(p2);
    
        
        Person1 p3= session1.get(Person1.class, 104); //not fire select query at 2nd time of fetching data from db,it will use/get the data from its cache
        System.out.println(p3);
        
    
        
        System.out.println(session1.contains(p1)); //it simply check whether given object is present in session cache or not
        
         session1.close();
        System.out.println("--------first Session Closed--------: ");       //first session closed
        
    System.out.println("\n--------Second Session started--------: ");
        
        Session session2 = factory.openSession();
        Person1 p7= session2.get(Person1.class, 104);   //if we are changing a session then first level cache will fire the query in the database for the second session
        System.out.println(p7); 
        
       
    Person1 p8= session2.get(Person1.class, 104); 
        System.out.println(p8);
        
        Person1 p9= session2.get(Person1.class, 104); 
        System.out.println(p9);
        
        /*    
         //here, first level cache is associated with session object not for whole factory object
         //means if we are creating 10 sessions and accessing same object 10 times in one factory, 
        //then it will hit the database 10 times/fire select query 10 times...
        //which is not recommended hence we need to use second level cache if we have
         *  multiple sessions in one factory
         */
        //so, second level cache will fire select query only once for all of the 10 sessions...bcz,it is associated with factory..means for one factory it will fire select query just once
    


    }

}
