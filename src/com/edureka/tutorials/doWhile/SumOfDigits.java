package com.edureka.tutorials.doWhile;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		sumOfDigits(num);

	}

	private static void sumOfDigits(int num) {
		int sum=0;
		int i=0;
		do {
			i=num%10;
			sum=sum+i;
			num=num/10;
		}
		while(num>0);
		System.out.println(sum);
	}

}
