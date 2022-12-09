package com.edureka.tutorials.whileExamples;

import java.util.Scanner;

public class GenerateTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		generateTable(num);
	}

	private static void generateTable(int num) {
		int i=1;
		int n=1;
		while(i<=10) {
			n=num*i;
			System.out.println(+num+ "x" +i+ "= "+n);
			i++;
		}
		
	}

}
