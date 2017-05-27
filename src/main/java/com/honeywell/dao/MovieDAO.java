package com.honeywell.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Movies;
import com.SessionHelper;

public class MovieDAO {
	public void addMovie(Movies movies) {
	SessionHelper sessionHelper= new SessionHelper();
	Session session = sessionHelper.getHibernateSession();
	Transaction tx = null;
    try {
        tx = session.beginTransaction();
        session.save(movies);
        session.getTransaction().commit();
    } catch (HibernateException e1) {
    	
   	 e1.printStackTrace(); 
   		 
   	 }
     finally {
        session.close(); 
     }
}

public void deleteUser(String movieId) {
	SessionHelper sessionHelper= new SessionHelper();
	Session session = sessionHelper.getHibernateSession();
	Transaction tx = null;
    try {
        tx = session.beginTransaction();
        Movies movies = (Movies) session.load(Movies.class, new String(movieId));
        session.delete(movies);
        session.getTransaction().commit();
    } catch (HibernateException e1) {
    	
   	 e1.printStackTrace(); 
   		 
   	 }
     finally {
        session.close(); 
     }
}

public void updateSeats(Movies movies) {
	SessionHelper sessionHelper= new SessionHelper();
	Session session = sessionHelper.getHibernateSession();
	Transaction tx = null;
	
	try{
	tx = session.beginTransaction();
    session.update(movies);
    session.getTransaction().commit();
       
      }catch (HibernateException e1) {
    	
    	 e1.printStackTrace(); 
    		 
    	 }
      finally {
         session.close(); 
      }
    
}

public List<Movies> getAllMovies() {
    List<Movies> movies = new ArrayList<Movies>();
    SessionHelper sessionHelper= new SessionHelper();
	Session session = sessionHelper.getHibernateSession();
	Transaction tx = null;
    try {
        tx = session.beginTransaction();
        movies = session.createQuery("from Movies").list();
    }catch (HibernateException e1) {
    	
   	 e1.printStackTrace(); 
   		 
   	 }
     finally {
        session.close(); 
     }
    return movies;
}

public Movies getMovieById(String movieId) {
    Movies movies = null;
    SessionHelper sessionHelper= new SessionHelper();
	Session session = sessionHelper.getHibernateSession();
	Transaction tx = null;
    try {
        tx = session.beginTransaction();
        String queryString = "from Movies where movieID = :id";
        Query query = session.createQuery(queryString);
        query.setString("id", movieId);
        movies = (Movies) query.uniqueResult();
    }catch (HibernateException e1) {
    	
   	 e1.printStackTrace(); 
   		 
   	 }
     finally {
        session.close(); 
     }
    return movies;
}
/*public static void main(String[] args) {
	Movies m=new Movies();
	m.setMovieID("movieID");
	m.setMovieName("Movie 1");
	m.setDate("27/05/2017");
	m.setPrice(100);
	m.setShowTiming("11am");
	m.setAvailableSeats(50);
	m.setToatalSeats(100);
	
	MovieDAO md=new MovieDAO();
	md.addMovie(m);
}*/
}
