package com.org.TablePerConcreateClass;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TablePerSubClass_Main {
	
	public static void main(String[] args) {
        // TODO Auto-generated method stub


         Session session= new Configuration().configure().buildSessionFactory().openSession();
    
         
         TeamIndia2 t1= new TeamIndia2("Ravi","Shastri");
              
         Batsman2 rohit= new Batsman2("right",78.3);
             rohit.setFname("roh");   //parents
             rohit.setLname("sh");
             
             
         Batsman2 dhoni= new Batsman2("right",27.3);
            dhoni.setFname("mahi");
            dhoni.setLname("dhoni");
            
         Batsman2 virat= new Batsman2("left",29.3);
             virat.setFname("virat");
             virat.setLname("kohli");
             
         Batsman2 kl= new Batsman2("right",19.3);
           kl.setFname("kkkk");
           kl.setLname("rahul");
         
         Bowler2 nehra= new Bowler2("right",72);
            nehra.setFname("ashish");
            nehra.setLname("nehra");
            
            
            
         Bowler2 bhuvi= new Bowler2("right",92);
             bhuvi.setFname("bhuvi");
             bhuvi.setLname("kuamar");
         Bowler2 jadeja= new Bowler2("left",12);
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
