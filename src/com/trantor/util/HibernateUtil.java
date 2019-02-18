package com.trantor.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				sessionFactory = new Configuration().configure(
						"hibernate.cfg.xml").buildSessionFactory();
			} catch (Throwable th) {
				System.err.println("initial  sessionFactory creation failed"
						+ th);
				throw new ExceptionInInitializerError(th);
			}
		}

		return sessionFactory;
	}
}
