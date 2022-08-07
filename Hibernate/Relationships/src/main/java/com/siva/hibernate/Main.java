package com.siva.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.siva.hibernate.models.Guide;
import com.siva.hibernate.models.Student;

public class Main {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Guide.class);
		SessionFactory sFactory = config.buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction txn = session.getTransaction();
		
		try {
			txn.begin();
			Guide guide = new Guide(1, "guide1", 1000);
			Student student1 = new Student(1,"Siva",guide);
			Student student = new Student(2,"Vish",guide );
			session.persist(student1);
			session.persist(student);
			txn.commit();
		}
		catch (Exception e) {
			if(txn != null ) {
				txn.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		
		
		
		

	}

}
