package com.edureka.tutorials;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		 checkLargestNum(num1,num2);
	}

	private static void checkLargestNum(int num1, int num2) {
		if(num1>num2) {
			System.out.println(+num1+ "  num1 is largest number");
		}
		else {
			System.out.println(+num2+ " num2 is largest number");
		}
	}
}
