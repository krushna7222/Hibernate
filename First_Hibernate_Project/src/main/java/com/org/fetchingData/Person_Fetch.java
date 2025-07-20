package com.org.fetchingData;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Person_Fetch {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session= new Configuration().configure().buildSessionFactory().openSession();
		
		
//		Person p1 = session.get(Person.class, 101);
		
//		System.out.println(p1);
		
		 //*****Similarity between get() and load()
        // Person p1=session.get(Person.class, 112);
         //System.out.println(p1);
         
         
         //Person p1=session.load(Person.class, 112);
        // System.out.println(p1);
         
         
         
         //*****1.difference between get() and load()
        // Person p1=session.get(Person.class, 120);       //get() returns null if the given id is not available in the database
        //System.out.println(p1);
         
        // Person p1=session.load(Person.class, 120);      //load() returns ObjectNotFoundException if the given id is not available in the database
         //System.out.println(p1);
         
         
         
        //*****2.difference between get() and load()
         Person p1=session.get(Person.class, 101);//get() will  fire select query everytime whenever we are using that object or not

        System.out.println(p1.getAge());    //get() will  fire select query
        System.out.println(p1.getName());  //get() will  fire select query
        System.out.println(p1);     //get() will fire select query when we access whole object
             
         
         
         Person p2=session.load(Person.class, 101);   //load() will NOT fire select query if we are not using/printing that whole object or its one of the property except id
            System.out.println(p2.getAge());    //load() will NOT fire select query(lazy loading)
           System.out.println(p2.getName());        //load() will fire select query(lazy loading) when we are getting properties of object(other than id)
                System.out.println(p2);                    //load() will fire query when we access whole object
        
		
	}

}
