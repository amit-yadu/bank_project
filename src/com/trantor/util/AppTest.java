package com.trantor.util;

import com.trantor.daos.AccountDao;
import com.trantor.daos.ContactDao;
import com.trantor.daos.UserDao;
import com.trantor.daos.UserRoleDao;
import com.trantor.models.Contact;
import com.trantor.models.User;
import com.trantor.models.UserRole;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * UserRoleDao dao=new UserRoleDao();
		 * dao.addUserRole("MarketingOfficer");
		 */
		 /*UserDao dao = new UserDao();
		 dao.addUserDetails();*/
		// // User user = dao.getUserById(5);
		// System.out.println(user.getUsername());
		// System.out.println(user.getRole().getTitle());

		/*UserRole user = new UserRoleDao().getUserRoleById(2);
		for (User u : user.getUsers()) {
			System.out.println(u.getUsername() + " " + u.getRole().getTitle());
		}*/

/*		AccountDao account=new AccountDao();
		account.addAccountDetails();*/
		
		
		/*UserRoleDao da1=new UserRoleDao();
		da1.getListOfRole();*/
		
		UserDao d=new UserDao();
		d.getListofUsers();
		
		
		

		/*
		 * 
		 * AccountDao dao=new AccountDao(); dao.addnewAccount();
		 */
	}

}
