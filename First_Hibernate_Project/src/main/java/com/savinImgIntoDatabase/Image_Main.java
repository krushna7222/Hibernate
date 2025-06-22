package com.savinImgIntoDatabase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Image_Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

        Configuration  cfg =new Configuration();  //Applicatio
            cfg.configure();  
            
         SessionFactory factory = cfg.buildSessionFactory();
         
         
         Session session = factory.openSession();
         
         Address a1= new Address();
            a1.setCity("pune"); 
            a1.setStreet("fc road");
            a1.setPincode(82828l);
            a1.setOpen(true);
            a1.setKm(5.6);
            
            Date d1=new Date();
            a1.setA_date(d1);
         
            //FileInputStream  fin= new FileInputStream("src/main/java/mobile.jpg");
            FileInputStream  fin= new FileInputStream("src/main/java/fcclg.jpg");
//            FileInputStream  fin= new FileInputStream("src/main/java/Free_Test_Data_500KB_DOCX.docx");
           
              byte data[] = new byte[fin.available()];
                fin.read(data);
            
            
            
            
            a1.setImg(data);//byte[]
         
         
         
         
         
         
         Transaction tx= session.beginTransaction();
           session.persist(a1);
          
             tx.commit();  //save
             
             session.close();
             factory.close();
             
             System.out.println("success");
    

	}

}
