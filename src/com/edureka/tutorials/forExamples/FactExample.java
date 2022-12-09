package com.edureka.tutorials.forExamples;

import java.util.Scanner;

public class FactExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		findFact(num);
	}

	private static int findFact(int num) {
		for(int i=num-1;i>0;i--) {
		  num=num*i;
		}
		System.out.println("factorial is " +num);
		
		return num;
	}
}
