package com.edureka.tutorials.forExamples;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		reverseNum(num);

	}

	private static void reverseNum(int num) {
		for(int i=0;num>0;i++) {
				int rem=num%10;
			    num=num/10;
			    System.out.print(rem);
		}
	}

}
