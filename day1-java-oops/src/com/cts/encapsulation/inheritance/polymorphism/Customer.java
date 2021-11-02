package com.cts.encapsulation.inheritance.polymorphism;

public class Customer extends Person {
	
	private int customerId;
	private Account account;
	
	public Customer(int customerId, String name, int age, String gender, Account account) {
		super(name, age, gender);
		this.customerId = customerId;
		this.account = account;
	}
	
	public void display() {
		System.out.println("display in Customer name = "+getName()
		+", id = "+getCustomerId()+", gender = "+getGender()+", account no = "+account.getAccountNumber()
		+", balance = "+account.getBalance());
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
