package com.trantor.models;

public class Transaction {

	private int id;
	private String username;
	private int user_id;
	private int acc_no;
	private String operation;
	private float tx_amt;
	private float balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public float getTx_amt() {
		return tx_amt;
	}
	public void setTx_amt(float tx_amt) {
		this.tx_amt = tx_amt;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
}
