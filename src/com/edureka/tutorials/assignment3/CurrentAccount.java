package com.edureka.tutorials.assignment3;

public final class CurrentAccount extends Account {

	public int withdraw(int amount, int balance) {
		amount = balance - amount;
		return amount;
	}

	public int deposit(int amount, int balance) {
		amount = amount + balance;
		return balance;
	}
}
