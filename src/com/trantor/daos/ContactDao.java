package com.trantor.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.trantor.models.Contact;
import com.trantor.models.User;
import com.trantor.models.UserRole;
import com.trantor.util.HibernateUtil;

public class ContactDao {
	public static SessionFactory factory;

	public void addUserContact() {

		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Contact c1 = new Contact();
            UserDao dao1=new UserDao();
			c1.setAddressline("addressline");
			c1.setCity("city");
			c1.setState("state");
			c1.setCountry("country");
			c1.setEmail("email");
			c1.setMobile("mobile");
			c1.setPin("pin");
		    //c1.setUser(dao1.getUserById(1));
			//dao1.getUserById(1);
            
           int  insert_id = (int) session.save(c1);
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

/*	public Contact getUserbyid(int id) {
		System.out.println("out session");
		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		System.out.println("in session");

		Transaction tx = null;
		
			tx = session.beginTransaction();
			Query q = session.createQuery("from Contact where id= :id");
			Contact u = (Contact) q;
			tx.commit();
			session.close();
			return u;


		}
*/

	public Contact getContactById(int id)
	{
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	Contact con = (Contact)session.get(Contact.class, id);
	return con;
	}
		
		

	}

