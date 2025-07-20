package com.org.criteriaAPI;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


public class CriteriaAPI_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		
		Criteria c = session.createCriteria(Laptop.class);
		
		
		//1.fetching specific records from the database by applying restrictions

		
//		c.add(Restrictions.like("name", "%a%"));
//		   c.add(Restrictions.like("name", "%o"));        //%o=> ends with 'o'
	     // c.add(Restrictions.like("name", "a____"));      //a____ => starts wit 'a' having 5 characters  %=>zero or more characters,    _ => only one character                               
	      // c.add(Restrictions.like("name", "____r"));      //____r means ending with r and having 5 characters in the names

		
//		List<Laptop> lapi = c.list();
//		lapi.forEach((y)->System.out.println(y));	
		
		
	//  //2.fetching specific records from the database by applying restrictions
      
       //c.add(Restrictions.ne("price", 78000));      //gt=> greater than //here,gt() is the static method of Restrictions class..hence we need to call it with class name
      //select * from laptop where price != 78000
       
//        c.add(Restrictions.lt("price", 78000.00));     //select * from laptop where price < 78000
//       c.add(Restrictions.le("price", 78000.25)); 
       //c.add(Restrictions.gt("price", 78000.52)); 
       //c.add(Restrictions.ge("price", 78000.14)); 
//       c.add(Restrictions.eq("price", 78000.52));
		   
		   
		   
//	   //3.fetching specific records from the database by applying restrictions
//         c.add(Restrictions.ge("price", 50000.25));

		   
//			List<Laptop> lapi = c.list();
//			lapi.forEach((y)->System.out.println(y));


		   
		   
//         
//    /*
//    //9.arranging price in ascending order
//      // c.add(Restrictions.ge("price", 78000));
//         c.addOrder(Order.asc("price"));      //returns price in ascending format...here, asc() isthe static method of Order class
//         c.addOrder(Order.desc("price"));
//         
//       List<Laptop> lapi =c.list();
//         
//         for( Laptop  ll : lapi)
//         {
//             System.out.println(ll.getPrice());
//             //System.out.println(ll);
//         }
         
         
       //Collection => interface
//       //Collections => class
//       
//     //Criteria => interface
//      //Criterias => class
//      
//      //Projection => interface
//      //Projections=> class
//  
//       
//       //**********Difference between criteria and projection
//  //In criteria, we can get multiple records, but in projection we will get 
//       //single value
//  
//  //but In Criteria we can add as many Projection object like we have added in below
//  //statements the max price and max id but the projection object of i.e ,max(id) will be override onto the max(price)
//
//      
//  
//  /*
//       
//  //11.getting max price
//  
//  //   c.add(Restrictions.like("name", "%o")); 
//       c.setProjection(Projections.max("price"));   //adding projection object in criteria   //Projections is the class and  Projection is an interface
//		
//		List<Double> maxp =c.list();
//        
//        for( Double ll : maxp)
//        {
//            System.out.println(ll);
//        }
		
//		c.setProjection(Projections.max("id"));  //Collections,Collection...Criteria,Criterias,Projection, PRojections
////        
//		List<Integer> maxp =c.list();
//        
//	        for( Integer ll : maxp)
//	        {
//	            System.out.println(ll);
//	        }
//
//      */
//       
//       
//      
//      
//       
//       /*
//      //12.getting min salary
//        c.setProjection(Projections.min("price"));
//        List<Double> minp =c.list();
//           
//           for( Double ll : minp)
//           {
//               System.out.println(ll);
//           }
//      
//      */
//  
//       
//       
//      /*              
//      //13.getting sum of price
//        c.setProjection(Projections.sum("price"));
//        List<Double> sump =c.list();
//           
//           for( Double ll : sump)
//           {
//               System.out.println(ll);
//           }
//       
//      */
//       

//       
//      /* 
//          //14.getting avg of price
//        c.setProjection(Projections.avg("price"));
//        List<Double> avgp =c.list();
//           
//           for( Double ll : avgp)
//           {
//               System.out.println(ll);
//           }
//      */
//       
//       
//       
//      /* 
//   //15.getting rowcount for ALL the columns
//        c.setProjection(Projections.rowCount());    //here, rowCount() count the rows of ALL the columns of a table
//        List<Long> maxp =c.list(); 
//           
//           for( Long ll : maxp)
//           {
//               System.out.println(ll);
//           }
//                         
//           //count(*),count(marks)
//      
//       */
//       
//      
//       
//       /*
//       //16.getting rowcount for SPECIFIC columns
//            c.setProjection(Projections.count("name"));   //here, count() returns all the records from  SPECIFIC COLUMN
//                                                         //if the null value exists in c_name column so this count() method will not count that null value
//            List<Long> countp =c.list();
//               
//               for( Long ll : countp)
//               {
//                   System.out.println(ll);
//               }
//       
//  */
     
//      /*     
//          //17.fetching all the records from the table using Criteria
//       List<Laptop> lapi =c.list();   //here,c.list() method returns all data from the table
//       
//       for( Laptop  ll : lapi)
//       {
//           System.out.println(ll);
//       }
		   


	}

}








//
///* 
//Criteria and projection API is nothing but set of methods that allows programmer 
// to fire complex type of query onto the database by applying different kinds of filtration rules and logical conditions.
// */
//
//public class Criteria_API {
//
//    //insert => save()
//    //delete=> delete()
//    //select single data=> get()/load()
//     //  select min(marks) from stud=>  gt()
//    //like(c_name, "a%")
//    //like(c_name, "a%")
//    //select * from laptop order by price asc;=> order()
//    //select * from laptop where price between 70000 and 90000; => between()
//    
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//
//         SessionFactory factory=new Configuration().configure().buildSessionFactory();
//        
//         Session s= factory.openSession();
//        
//         //here, Criteria is an interface....and Criterias is class//Projection is an interface
//        
//         Criteria c =s.createCriteria(Laptop.class);    //here,we are creating criteria object c to perform opeartions on the laptop table
//    //     Criteria c1 =s.createCriteria(Student.class); 
//        
//                 
//         
//         
//         /* In below operations we have not used the table name as Laptop bcz, 
//          * all of the below opeartions/api's we executed on the Criteria object c...
//          * and at time of creating that criteria(in above code) we have already specify the table name so any operation which is performed on the criteria object c uses the same table Laptop
//           */
// 
//
///*
//         
//                  
//        
//        

//        
//         
//         
//         
//    /*     //4.fetching price equal to 78000
//         c.add(Restrictions.eq("price", 78000));    //returns a records having a price equal to 78000
//        
//        List<Laptop> lapi =c.list();
//         
//         for( Laptop  ll : lapi)
//         {
//             System.out.println(ll);
//         }
//        
//        */
//    
//         
//
//        /*
//         //6.fetching price between 50000 to 70000
//      // c.add(Restrictions.between("price", 60000,70000));       //select * from laptop where price between 50000 and 70000;
//    //c.add(Restrictions.between("c_name", "abc","lenovo"));  //here,it returns c_name which is starting between a to l
//
//        //abcdefghijklm
//         List<Laptop> lapi =c.list();
//         
//         for( Laptop  ll : lapi)
//         {
//             System.out.println(ll);
//         }
//*/
//        
//         
//         
//    /*     
//    //8.checking whether given field is empty or not
//        System.out.println(c.add(Restrictions.isNotEmpty("c_name")));    
//
//    */
//         
         

//               
//         
//        /* 
//    //10.arranging price in descending order
//         c.addOrder(Order.desc("price"));    //returns a records having a price equal to 78000
//        
//       List<Laptop> lapi =c.list();
//         
//         for( Laptop  ll : lapi)
//         {    
//        
//             
//             System.out.println(ll.getPrice());
//         }
//         
//         */
//        
//         
//         
//        
//    
//        
//     
//         
//         */
//         
//         s.close();
//    }
//
//}
//

