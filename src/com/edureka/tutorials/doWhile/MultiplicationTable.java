package com.edureka.tutorials.doWhile;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		generateTable(num);

	}

	private static void generateTable(int num) {
		int i=1;
		int n=1;
		do {
			n=num*i;
			System.out.println(+num+ "X" +i+ "=" +n);
			i++;
		}
		while(i<=10);
	}

}
