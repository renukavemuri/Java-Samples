package com.edureka.tutorials.whileExamples;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		findFact(num);
	}

	private static int findFact(int num) {
		int i=num-1;
		while(i>0) {
			num=num*i;
			i--;
		}
		System.out.println(num);
		return num;
	}

}
