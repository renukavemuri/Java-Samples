package com.edureka.tutorials.forExamples;

import java.util.Scanner;

public class FindSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		findSum(num);
	}

	private static void findSum(int num) {
	    int sum=0;
		for(int i=0;num>0;i++) {
			sum=sum+num%10;
			num=num/10;
		}		
		System.out.println("Total sum is  " +sum);
	}
}
