package com.edureka.tutorials.whileExamples;

import java.util.Scanner;

public class EvenOddPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		evenNumber();
		oddNumber();
	}
	
	private static void evenNumber() {
		int i=1;
		while(i<=20) {
			if(i%2==0) {
			System.out.println("Even numbers" +i);
		  	}
			i++;
		}
		 
		}
	private static void oddNumber() {
		int i=1;
		while(i<=20) {
		if(i%2==1) {
			System.out.println("Odd numbers" +i);
		}
		i++;
		}
		}
}
