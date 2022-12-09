package com.edureka.tutorials;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		calculateAge(age);

}
	
	public static int calculateAge(int age) {
		
		if(age>=18) {
			System.out.println("Age is  " +age+ "  eligible for voting");
		}
		else {
			System.out.println("Not eligible for voting");
		}
		return age;
	}
}