package com.edureka.tutorials.assignment3;

public abstract class Account {
	double accountNo;
	String accountName;
	float amount;

	public double getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(double accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
}
