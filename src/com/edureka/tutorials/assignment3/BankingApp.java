package com.edureka.tutorials.assignment3;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter which type of account to be created");
		String str=sc.next();
		Account sa=new SavingsAccount();
		Account ca=new CurrentAccount();
		switch(str) {
		
		case "SavingsAccount":{
			System.out.println("enter accountNumber  \t");
			sa.getAccountName();
			sa.accountNo=sc.nextDouble();
			System.out.println("enter accountname  \t");
			sa.accountName=sc.next();
			System.out.println("enter amount");
			sa.amount=sc.nextFloat();
			System.out.println("AccountNo   \t     AccountName   \t      amount");
			System.out.println(sa.accountNo+ "\t" +sa.accountName+ " \t " +sa.amount);
			System.out.println("Account created");
			break;
		}
		case "CurrentAccount":{
			System.out.println("enter accountNumber  \t");
			ca.accountNo=sc.nextDouble();
			System.out.println("enter accountname  \t");
			ca.accountName=sc.next();
			System.out.println("enter amount");
			ca.amount=sc.nextFloat();
			System.out.println("AccountNo   \t     AccountName   \t      amount");
			System.out.println(ca.accountNo+ "\t" +ca.accountName+ " \t " +ca.amount);
			System.out.println("Account created");
			break;
		}
		case "withdraw":
			System.out.println("enter amount to withdraw");
			int n =sc.nextInt();
			
			System.out.println("available balance" +n);
		}
	}

}
