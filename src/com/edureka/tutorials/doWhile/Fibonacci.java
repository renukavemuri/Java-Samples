package com.edureka.tutorials.doWhile;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		fibonacci(num);

	}

	private static void fibonacci(int num) {
		int a=0;
		int b=0;
		int c=1;
		int i=1;
		do {
			a=b;
			b=c;
			c=a+b;
			System.out.println("Fibonacci series......." +a);
			i++;
		}
		while(i<=num);
		
	}

}
