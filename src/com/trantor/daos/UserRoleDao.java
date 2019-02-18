package com.trantor.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.trantor.models.User;
import com.trantor.models.UserRole;
import com.trantor.util.HibernateUtil;

public class UserRoleDao {
	public static SessionFactory factory;

	public void addUserRole(String title) {
		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			UserRole r1 = new UserRole();
			r1.setTitle(title);
			int insert_id = (int) session.save(r1);
			System.err.println("Inseeted id:" + insert_id);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				e.printStackTrace();
				System.err.println("Error:" + e.getMessage());
			}
		} finally {
			session.close();
		}

	}

	public List<UserRole> getListOfRole() {
		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<UserRole> userrole = (List<UserRole>) session.createQuery(
				"from UserRole").list();
		if (userrole != null) {
		//	for(UserRole role:userrole){
			System.out.println("UserRole List"+userrole);
			System.out.println("No of Users"+userrole.size());
			return userrole;
	//	}
		}
		tx.commit();
		session.close();
		return null;
	}

	public UserRole getUserRoleById(int id) {

		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		UserRole usr = (UserRole) session.get(UserRole.class, id);
		t.commit();
		session.close();
		return usr;

	}

}
