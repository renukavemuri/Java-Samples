package com.edureka.tutorials.doWhile;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		reverseNum(num);
	}

	private static void reverseNum(int num) {
		int rev=0;
		do {
			rev=num%10;
			num=num/10;
			System.out.print(rev);
		}
		while(num>0);
		
	}

}
