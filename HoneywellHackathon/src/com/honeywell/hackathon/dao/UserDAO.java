package com.honeywell.hackathon.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.SessionHelper;
import com.User;

public class UserDAO {    
	public void addUser(User user) {
	SessionHelper sessionHelper= new SessionHelper();
	Session session = sessionHelper.getHibernateSession();
	Transaction tx = null;
    try {
        tx = session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    } catch (HibernateException e1) {
    	
   	 e1.printStackTrace(); 
   		 
   	 }
     finally {
        session.close(); 
     }
}

public void deleteUser(String userid) {
	SessionHelper sessionHelper= new SessionHelper();
	Session session = sessionHelper.getHibernateSession();
	Transaction tx = null;
    try {
        tx = session.beginTransaction();
        User user = (User) session.load(User.class, new String(userid));
        session.delete(user);
        session.getTransaction().commit();
    } catch (HibernateException e1) {
    	
   	 e1.printStackTrace(); 
   		 
   	 }
     finally {
        session.close(); 
     }
}

public void updateUser(User user) {
	SessionHelper sessionHelper= new SessionHelper();
	Session session = sessionHelper.getHibernateSession();
	Transaction tx = null;
	System.out.println("asdasdas");
	try{
	tx = session.beginTransaction();
    session.update(user);
    session.getTransaction().commit();
       
      }catch (HibernateException e1) {
    	
    	 e1.printStackTrace(); 
    		 
    	 }
      finally {
         session.close(); 
      }
    
}

public List<User> getAllUsers() {
    List<User> users = new ArrayList<User>();
    SessionHelper sessionHelper= new SessionHelper();
	Session session = sessionHelper.getHibernateSession();
	Transaction tx = null;
    try {
        tx = session.beginTransaction();
        users = session.createQuery("from User").list();
    }catch (HibernateException e1) {
    	
   	 e1.printStackTrace(); 
   		 
   	 }
     finally {
        session.close(); 
     }
    return users;
}

public User getUserById(String userid) {
    User user = null;
    SessionHelper sessionHelper= new SessionHelper();
	Session session = sessionHelper.getHibernateSession();
	Transaction tx = null;
    try {
        tx = session.beginTransaction();
        String queryString = "from User where userID = :id";
        Query query = session.createQuery(queryString);
        query.setString("id", userid);
        user = (User) query.uniqueResult();
    }catch (HibernateException e1) {
    	
   	 e1.printStackTrace(); 
   		 
   	 }
     finally {
        session.close(); 
     }
    return user;
}

}