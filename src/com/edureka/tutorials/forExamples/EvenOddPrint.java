package com.edureka.tutorials.forExamples;

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
		for(int i=0;i<=20;i++) {
			if(i%2==0) {
			System.out.println("Even numbers" +i);
		}
	}
		System.out.println("-----------------");
		
}
	
	private static void oddNumber() {
		for(int i=0;i<=20;i++) {
			if(i%2==1) {
			System.out.println("Even numbers" +i);
		}
	}
		
}
}
