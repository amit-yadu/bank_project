package com.trantor.daos;

import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.Check;
import org.hibernate.cfg.Configuration;

import com.trantor.models.Account;
import com.trantor.models.Contact;
import com.trantor.models.User;
import com.trantor.models.UserRole;
import com.trantor.util.HibernateUtil;

public class UserDao {
	public static SessionFactory factory;

	public void addUserDetails(User u1, Contact c1) {

		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			u1.setContact(c1);
			System.out.println("inside in dao method ");
			System.out.println(u1.getUsername() + "dao method");
			System.out.println(c1.getEmail() + "dao method" + "");
			int insert_id = (int) session.save(u1);
			System.err.println("Inseeted id:" + insert_id);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				System.err.println("Error" + e.getMessage());
				e.printStackTrace();
			}
		} finally {
			session.close();
		}
	}

	public User getUserById(int id) {
		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		User usr = (User) session.get(User.class, id);
		session.close();
		return usr;
	}

	public List<User> getListofUsers() {
		factory=HibernateUtil.getSessionFactory();
         Session session=factory.openSession();
         Transaction tx=session.beginTransaction();
         @SuppressWarnings("unchecked")
		 List<User> users=session.createQuery("from User").list();
         if(users!=null){
        	 System.out.println("Users Object Size"+users.size());
        	 
        	 return users;
         }
         tx.commit();
         session.close();
         System.out.println("null wala part");
    	 return null;

	}
	
	
	/*public List<User> getEmployees() {
		List<User> list = new ArrayList<User>();
		list = template.loadAll(User.class);
		return list;
	}*/
}
