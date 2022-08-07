package com.siva.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.siva.models.Address;
import com.siva.models.Person;

public class PersonDemo {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Person.class);
		SessionFactory sFactory = config.buildSessionFactory();
		Session session = sFactory.openSession();
		
		Address sivaAddress = new Address("xxx street, yyy area, Pondicherry", 602938);
		Person siva = new Person("Siva", 22, sivaAddress);
		
		org.hibernate.Transaction txn = session.getTransaction();
		txn.begin();
		session.save(siva);
		txn.commit();
		
		
		
		
		
		session.save(siva);
		
		
		
	}

}
