package com.org.tablePerSubClass;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TablePerSubClass_Main {
	
	public static void main(String[] args) {
        // TODO Auto-generated method stub


         Session session= new Configuration().configure().buildSessionFactory().openSession();
    
         
         TeamIndia1 t1=new TeamIndia1("Ravi","Shastri");
              
         Batsman1 rohit= new Batsman1("right",78.3);
             rohit.setFname("roh");   //parents
             rohit.setLname("sh");
             
             
         Batsman1 dhoni= new Batsman1("right",27.3);
            dhoni.setFname("mahi");
            dhoni.setLname("dhoni");
            
         Batsman1 virat= new Batsman1("left",29.3);
             virat.setFname("virat");
             virat.setLname("kohli");
             
         Batsman1 kl= new Batsman1("right",19.3);
           kl.setFname("kkkk");
           kl.setLname("rahul");
         
         Bowler1 nehra= new Bowler1("right",72);
            nehra.setFname("ashish");
            nehra.setLname("nehra");
            
            
            
         Bowler1 bhuvi= new Bowler1("right",92);
             bhuvi.setFname("bhuvi");
             bhuvi.setLname("kuamar");
         Bowler1 jadeja= new Bowler1("left",12);
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
