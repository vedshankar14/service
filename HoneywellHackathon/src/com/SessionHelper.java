package com;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class SessionHelper {
	
	public Session getHibernateSession(){
		
		Configuration configuration =  new Configuration().configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		System.out.println("the session object.."+session);
		
		return session;

	}
	
	public void closeHibernateSession(Session session)
	{
		session.close();
		System.out.println("session successfully closed...");
	}

}
