package com.trantor.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "account_details")
@SequenceGenerator(name = "seq", initialValue = 3, allocationSize = 100)
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
	
//	@PrimaryKeyJoinColumn
	private int acc_id;
	private float balance;
	private String acc_type;
/*	@OneToOne(targetEntity = User.class, cascade = CascadeType.ALL)
	private User accuser;

	public User getAccuser() {
		return accuser;
	}

	public void setAccuser(User accuser) {
		this.accuser = accuser;
	}*/

	public int getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getAcc_type() {
		return acc_type;
	}

	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}

}
