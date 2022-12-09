package com.edureka.tutorials.doWhile;

import java.util.Scanner;

public class EvenOddPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		evenNum(num);
		oddNum(num);
	}

	private static void evenNum(int num) {
		int i=1;
		do {
			if(i%2==0) {
				System.out.println("Even numbers" +i);
			  	}
				i++;
		}
		while(i<=20);
		
	}
	
	private static void oddNum(int num) {
		int i=1;
		do {
			if(i%2==1) {
				System.out.println("Odd numbers" +i);
			  	}
				i++;
		}
		while(i<=20);
		
	}

}
