package com.trantor.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.trantor.models.Account;
import com.trantor.models.User;
import com.trantor.models.UserRole;
import com.trantor.util.HibernateUtil;

public class AccountDao {

	public static SessionFactory factory;

	/*
	 * public void addnewAccount() {
	 * 
	 * factory = HibernateUtil.getSessionFactory(); Session session =
	 * factory.openSession(); Transaction tx = null; try { tx =
	 * session.beginTransaction(); Account a1 = new Account(); UserDao d1 = new
	 * UserDao(); a1.setAcc_type("acc_type"); a1.setBalance(50000); User
	 * user=new UserDao().getUserById(2); // a1.setAccuser(user); ///
	 * a1.setAccuser(d1.getUserById(5)); int insert_id = (int) session.save(a1);
	 * System.err.println("Inseeted id:" + insert_id); tx.commit(); } catch
	 * (Exception e) { if (tx != null) { System.err.println("Error" +
	 * e.getMessage()); e.printStackTrace(); } } finally { session.close(); } }
	 */

	public void addAccountDetails() {

		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Account account = new Account();
			account.setAcc_type("saving");
			account.setBalance(50000);

			User user = new UserDao().getUserById(11);
			user.setAccount(account);
			session.update(user);

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

}
