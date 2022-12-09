package com.edureka.tutorials;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number to ckeck");
			int num=sc.nextInt();
			checkNum(num);
	}
	
	public static int checkNum(int num) {
		if(num>0) {
			System.out.println(+num+ " positive number");
		}
		else if(num<0){
			System.out.println(+num+ " negetive number");
		}
		else {
			System.out.println("Number is zero");
		}
		return num;
	}

}
