package com.edureka.tutorials.assignment2;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {

		int[] empId = new int[5];
		String[] empName = new String[5];
		float[] salary = new float[5];
		
		String name=" ";
		for (int i = 0; i < 5; i++) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Employee Id ,emp name, employee salary");
			empId[i] = sc.nextInt();
			empName[i] = sc.next();
			salary[i] = sc.nextFloat();
		}
			
			EmployeeDetails emp = new EmployeeDetails();
		
			  emp.display(empId, empName, salary);
			 
			   emp.display(empId, empName);
		
				emp.display(name,empId ,empName,salary);
		
		}

	private static void display(String name, int[] empId, String[] empName, float[] salary) {
		
		System.out.println("--------------------------");
		System.out.println("enter name to search");
		Scanner sc = new Scanner(System.in);
		name=sc.next();
		int len=empId.length;
		for(int i=0;i<len;i++) {
			if(empName[i].equals(name)) {
		System.out.println(name+  " \t  "  +empId[i]+ " \t  "  +empName[i]+ " \t " +salary[i]);
		}
	}
	}

	private static void display(int[] empId, String[] empName) {
		System.out.println("--------------------------");
		System.out.println("empId \t    empName \t  ");
		int len=empId.length;
		for(int i=0;i<len;i++) {
		System.out.println(empId[i]+ " \t  "  +empName[i]);
		}	
	}

	private static void display(int[] empId, String[] empName, float[] salary) {
		
		System.out.println("--------------------------");
		System.out.println("empId \t  empName \t  salary \t");
		int len=empId.length;
		for(int i=0;i<len;i++) {
		System.out.println(empId[i]+ " \t  "  +empName[i]+ " \t " +salary[i]);
		}

	}

}
