package com.edureka.tutorials.doWhile;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		findFact(num);
	}

	private static void findFact(int num) {
		int i=num-1;
		do {
			num=i*num;
			i--;
		}
		while(i>0);
		System.out.println(num);
	}
}
