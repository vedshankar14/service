package com.honeywell.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Bookings;
import com.SessionHelper;

public class BookingDao {
	public void bookTicket(Bookings bookings) {
		SessionHelper sessionHelper= new SessionHelper();
		Session session = sessionHelper.getHibernateSession();
		Transaction tx = null;
	    try {
	        tx = session.beginTransaction();
	        session.save(bookings);
	        session.getTransaction().commit();
	    } catch (HibernateException e1) {
	    	
	   	 e1.printStackTrace(); 
	   		 
	   	 }
	     finally {
	        session.close(); 
	     }
	}

	public void cancelTiket(String userid) {
		SessionHelper sessionHelper= new SessionHelper();
		Session session = sessionHelper.getHibernateSession();
		Transaction tx = null;
	    try {
	        tx = session.beginTransaction();
	        Bookings bookings = (Bookings) session.load(Bookings.class, new String(userid));
	        session.delete(bookings);
	        session.getTransaction().commit();
	    } catch (HibernateException e1) {
	    	
	   	 e1.printStackTrace(); 
	   		 
	   	 }
	     finally {
	        session.close(); 
	     }
	}

	public void updateBooking(Bookings bookings) {
		SessionHelper sessionHelper= new SessionHelper();
		Session session = sessionHelper.getHibernateSession();
		Transaction tx = null;
		System.out.println("asdasdas");
		try{
		tx = session.beginTransaction();
	    session.update(bookings);
	    session.getTransaction().commit();
	       
	      }catch (HibernateException e1) {
	    	
	    	 e1.printStackTrace(); 
	    		 
	    	 }
	      finally {
	         session.close(); 
	      }
	    
	}

	public List<Bookings> getAllBookings() {
	    List<Bookings> bookings = new ArrayList<Bookings>();
	    SessionHelper sessionHelper= new SessionHelper();
		Session session = sessionHelper.getHibernateSession();
		Transaction tx = null;
	    try {
	        tx = session.beginTransaction();
	        bookings = session.createQuery("from Bookings").list();
	    }catch (HibernateException e1) {
	    	
	   	 e1.printStackTrace(); 
	   		 
	   	 }
	     finally {
	        session.close(); 
	     }
	    return bookings;
	}

	public Bookings getBookings(String userid) {
	    Bookings bookings = null;
	    SessionHelper sessionHelper= new SessionHelper();
		Session session = sessionHelper.getHibernateSession();
		Transaction tx = null;
	    try {
	        tx = session.beginTransaction();
	        String queryString = "from Bookings where userID = :id";
	        Query query = session.createQuery(queryString);
	        query.setString("id", userid);
	        bookings = (Bookings) query.uniqueResult();
	    }catch (HibernateException e1) {
	    	
	   	 e1.printStackTrace(); 
	   		 
	   	 }
	     finally {
	        session.close(); 
	     }
	    return bookings;
	}

}
