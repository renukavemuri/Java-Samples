package com.edureka.tutorials.ifExamples;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		checkEvenOdd(num);
	}

	private static void checkEvenOdd(int num) {
		if(num%2 == 0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("number is odd");
		}
	}

}
