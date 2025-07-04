package com.org.tablePerClass;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TablePerClass_Main {
	
	public static void main(String[] args) {
        // TODO Auto-generated method stub


         Session session= new Configuration().configure().buildSessionFactory().openSession();
    
         
         TeamIndia t1=new TeamIndia("Ravi","Shastri");
              
         Batsman rohit= new Batsman("right",78.3);
             rohit.setFname("roh");   //parents
             rohit.setLname("sh");
             
             
         Batsman dhoni= new Batsman("right",27.3);
            dhoni.setFname("mahi");
            dhoni.setLname("dhoni");
            
         Batsman virat= new Batsman("left",29.3);
             virat.setFname("virat");
             virat.setLname("kohli");
             
         Batsman kl= new Batsman("right",19.3);
           kl.setFname("kkkk");
           kl.setLname("rahul");
         
         Bowler nehra= new Bowler("right",72);
            nehra.setFname("ashish");
            nehra.setLname("nehra");
            
            
            
         Bowler bhuvi= new Bowler("right",92);
             bhuvi.setFname("bhuvi");
             bhuvi.setLname("kuamar");
         Bowler jadeja= new Bowler("left",12);
            jadeja.setFname("ravidra");
            jadeja.setLname("jadeja");
         
         Transaction tx= session.beginTransaction();
         
            session.persist(t1);
            session.persist(rohit);
            session.persist(dhoni);
            session.persist(virat);
            session.persist(kl);
            
            session.persist(nehra);
            session.persist(bhuvi);
            session.persist(jadeja);
            session.persist(t1);
         
            tx.commit();
            
            session.close();
            
    }

}
