package com.edureka.tutorials.whileExamples;

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
		while(num>0) {
			sum = sum+num%10;
			num = num/10;			
		}
		System.out.println(sum);
	}

}
