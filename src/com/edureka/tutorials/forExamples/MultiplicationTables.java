package com.edureka.tutorials.forExamples;

import java.util.Scanner;

public class MultiplicationTables {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for table");
		int num=sc.nextInt();
		generateTable(num);
	}

	private static int generateTable(int num) {
		int n=1;
		for(int i=1;i<=10;i++) {
			n=num*i;
			System.out.println(+num+ "  x  " +i + " = " +n);
		}
		return num;
	}

}
