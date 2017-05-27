package com.honeywell.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.SessionHelper;
import com.Shows;

public class ShowDAO {
	public void addShow(Shows shows) {
		SessionHelper sessionHelper= new SessionHelper();
		Session session = sessionHelper.getHibernateSession();
		Transaction tx = null;
	    try {
	        tx = session.beginTransaction();
	        session.save(shows);
	        session.getTransaction().commit();
	    } catch (HibernateException e1) {
	    	
	   	 e1.printStackTrace(); 
	   		 
	   	 }
	     finally {
	        session.close(); 
	     }
	}

	public void deleteShow(String movieID) {
		SessionHelper sessionHelper= new SessionHelper();
		Session session = sessionHelper.getHibernateSession();
		Transaction tx = null;
	    try {
	        tx = session.beginTransaction();
	        Shows shows = (Shows) session.load(Shows.class, new String(movieID));
	        session.delete(shows);
	        session.getTransaction().commit();
	    } catch (HibernateException e1) {
	    	
	   	 e1.printStackTrace(); 
	   		 
	   	 }
	     finally {
	        session.close(); 
	     }
	}

	
	public List<Shows> getAllShows() {
	    List<Shows> shows = new ArrayList<Shows>();
	    SessionHelper sessionHelper= new SessionHelper();
		Session session = sessionHelper.getHibernateSession();
		Transaction tx = null;
	    try {
	        tx = session.beginTransaction();
	        shows = session.createQuery("from Shows").list();
	    }catch (HibernateException e1) {
	    	
	   	 e1.printStackTrace(); 
	   		 
	   	 }
	     finally {
	        session.close(); 
	     }
	    return shows;
	}

	public Shows getShowById(String movieID) {
	    Shows shows = null;
	    SessionHelper sessionHelper= new SessionHelper();
		Session session = sessionHelper.getHibernateSession();
		Transaction tx = null;
	    try {
	        tx = session.beginTransaction();
	        String queryString = "from Shows where movieId = :id";
	        Query query = session.createQuery(queryString);
	        query.setString("id", movieID);
	        shows = (Shows) query.uniqueResult();
	    }catch (HibernateException e1) {
	    	
	   	 e1.printStackTrace(); 
	   		 
	   	 }
	     finally {
	        session.close(); 
	     }
	    return shows;
	}
public static void main(String[] args) {
	Shows s=new Shows();
	s.setMovieID("movieID");
	s.setTheatreId("thertreId");
	ShowDAO sd=new ShowDAO();
	sd.addShow(s);
}
}
