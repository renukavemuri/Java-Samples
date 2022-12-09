package com.edureka.tutorials.forExamples;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		findFibonacci(num);
	}

	private static void findFibonacci(int num) {
		int num1=0;
		int num2=1;
		int num3=0;
		for(int i=0;i<num;i++) {
			if(i<=1)
				num3=i;
			else {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			}
			System.out.println(num3);
			}	
		}
	}

