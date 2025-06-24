package com.bankCustomer;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BankCustomer_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		
		
		Customer c1 = new Customer();
				c1.setAdharno(123456);
				c1.setName("Sachin Purkar");
		BankAccounts b1 = new BankAccounts();
					b1.setAccountNo(987654);
					b1.setBankName("Kotak Mahindra Bank");
					b1.setCust(c1);
		BankAccounts b2 = new BankAccounts();
					b2.setAccountNo(654321);
					b2.setBankName("Bank OF Maharashtra");
					b2.setCust(c1);
		BankAccounts b3 = new BankAccounts();
					b3.setAccountNo(369258);
					b3.setBankName("HDFC Bank");
					b3.setCust(c1);
		List<BankAccounts> balist = new ArrayList<BankAccounts>();
							balist.add(b1);
							balist.add(b2);
							balist.add(b3);
				c1.setAccount(balist);
				
				
		Customer c2 = new Customer();
				c2.setAdharno(456789);
				c2.setName("Hemraj Raut");
		BankAccounts b4 = new BankAccounts();
				b4.setAccountNo(369852);
				b4.setBankName("ICICI BAnk");
				b4.setCust(c2);
		BankAccounts b5 = new BankAccounts();
				b5.setAccountNo(258741);
				b5.setBankName("Axis Bank");
				b5.setCust(c2);
		BankAccounts b6 = new BankAccounts();
				b6.setAccountNo(587456);
				b6.setBankName("State Bank Of India");
				b6.setCust(c2);
		List<BankAccounts> balist2 = new ArrayList<BankAccounts>();
						balist2.add(b4);
						balist2.add(b5);
						balist2.add(b6);
				c2.setAccount(balist2);
				
				
				session.persist(c1);
		session.persist(b1);
		session.persist(b2);
		session.persist(b3);
		session.persist(b4);
		session.persist(b5);
		session.persist(b6);
		session.persist(c2);
		
		Transaction tx =session.beginTransaction();
		
		tx.commit();
		
		session.close();
		
		System.out.println("Success...");

	}

}
