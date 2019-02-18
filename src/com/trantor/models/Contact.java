package com.trantor.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact_details")
public class Contact {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String addressline;
	private String city;
	private String state;
    private String country;

	private String email;
	private String mobile;
	private String pin;
	
	
//	@OneToOne(targetEntity=User.class)  
//	private User user;
	
    /*public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddressline() {
		return addressline;
	}
	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}



	
}
