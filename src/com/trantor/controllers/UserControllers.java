package com.trantor.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trantor.daos.UserDao;
import com.trantor.daos.UserRoleDao;
import com.trantor.models.Account;
import com.trantor.models.Contact;
import com.trantor.models.User;
import com.trantor.models.UserRole;

@Controller
// @RequestMapping("/user")
public class UserControllers {

	UserDao dao = new UserDao();

	@RequestMapping(value = "/userindex")
	public String welcome() {
		System.out.println("lj");
		return "redirect:/viewuser";
	}

	@RequestMapping(value = "/customerform")
	public String signup(Model m) {
		System.out.println("customerform");
		m.addAttribute("command", new User());
		return "customerform";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("command") User user,
			HttpServletRequest request) {

		System.out.println("save.........");

		Contact contact = new Contact();
		contact.setCity(request.getParameter("city"));
		contact.setState(request.getParameter("state"));
		contact.setCountry(request.getParameter("country"));
		contact.setMobile(request.getParameter("mobile"));
		contact.setEmail(request.getParameter("email"));
		contact.setPin(request.getParameter("pin"));
		contact.setAddressline(request.getParameter("addressline"));
		UserRole role = new UserRoleDao().getUserRoleById(Integer
				.parseInt(request.getParameter("role_id")));
		user.setRole(role);
		System.out.println(role.getTitle());
		// Account account = new Account();
		// account.setAcc_type("nulla");
		// account.setBalance(100);
		// user.setAccount(account);

		new UserDao().addUserDetails(user, contact);
		return "redirect:/viewuser";
	}

	@RequestMapping("/viewrole")
	public String viewroles(Model m) {
		UserRoleDao d1 = new UserRoleDao();
		List<UserRole> list = d1.getListOfRole();
		m.addAttribute("list", list);
		return "viewallusers";
	}

	@RequestMapping("/viewuser")
	public String viewusers(Model m) {
		System.out.println("inside view users");
		List<User> list = new UserDao().getListofUsers();
		m.addAttribute("list", list);
		System.out.println("list of users" + list);
		return "viewallusers";
	}

	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public String loginCheck() {
		return "redirect:/viewuser";
	}

}
