package com.org.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQL_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     SessionFactory factory=new Configuration().configure().buildSessionFactory();
         
         Session session = factory.openSession();
		
         Transaction tx = session.beginTransaction();
		
        //1.
//        Query<Student3> q= session.createQuery("from Student3");
//               List<Student3>  s_list = q.list();
//          s_list.forEach((h)-> System.out.println(h));
//     
//        
        
        
        //2
         
//        Query<Student3> q= session.createQuery("from Student3 where city='mumbai'");
//           List<Student3>  s_list = q.list();
//      s_list.forEach((h)-> System.out.println(h));
//    
                
        
        //3.parameteric queries in HQL , alias
         
//        Query<Student3> q= session.createQuery("from Student3 as s where s.city= :m");
//            q.setParameter("m", "pune");
//        
//           List<Student3>  s_list = q.list();
//      s_list.forEach((h)-> System.out.println(h));
      
        
        
        
        //4. and , or operator
         
//                Query<Student3> q= session.createQuery("from Student3 as s where s.city= :m and s.marks > :z");
//                    q.setParameter("m", "mumbai");
//                    q.setParameter("z", 80);
//                
//                   List<Student3>  s_list = q.list();
//              s_list.forEach((h)-> System.out.println(h));
              
                
        
        
        
        //6.update operation in HQL
        
//        Query<Student3> q= session.createQuery("update Student3 set marks=:p where id=:j");
//        q.setParameter("p", 95);
//        q.setParameter("j", 104);
//    
//        int i=q.executeUpdate();
//        
//       System.out.println(i+" records updated successfully");
//        
//       
//           tx.commit();
           
        
        
        
        //7.delete operation in HQL
        
//        Query<Student3> q= session.createQuery("delete from Student3 where id=:v");
//        q.setParameter("v", 108);
//       
//        int i=q.executeUpdate();
//        
//       System.out.println(i+" records deleted successfully");       
//       
//           tx.commit();

	}

}
