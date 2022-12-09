package com.edureka.tutorials.assignment3;

public final class SavingsAccount extends Account {

	public static final int rateOfInterest = 4;

	public int withdraw(int amount, int balance) {
		amount = balance - amount;
		return amount;
	}

	public int deposit(int amount, int balance) {
		amount = amount + balance;
		return balance;
	}

}
