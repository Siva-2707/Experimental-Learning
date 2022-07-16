package com.siva.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.siva.models.Member;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration config = new Configuration().configure().addAnnotatedClass(Member.class);
        
        SessionFactory sessionFactory = config.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Member member = new Member ();
        member.setId(2);
        
        member.setMembershipActive(true);
//        member.setId(1);
        member.setName("Siva");
        
		
        Transaction tn = session.beginTransaction();
        member = (Member) session.get(Member.class, 2);
        member.setMembershipActive(false);
        member.setName("Shree");
        session.update(member);
 
        tn.commit();
    }
}
