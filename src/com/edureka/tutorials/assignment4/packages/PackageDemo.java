package com.edureka.tutorials.assignment4.packages;

public class PackageDemo {
	public int add(int a, int b)	{
		int res = a+b;
		System.out.println("Calling add  method in primary package");
		return res;
	}
	
	public int sub(int a,int b) {
		int res=a-b;
		System.out.println("Calling subtraction  method in primary package");
		return res;
	}
	
	public int div(int a,int b) {
		int res = a/b;
		System.out.println("Calling division  method in primary package");
		return res;
	}
	
	public int fact(int n) {
		
		for(int i=n-1;i>0;i--) {
			n=n*i;
		}
		System.out.println("Calling factorial  method in primary package");
		return n;
	}

	public int rev(int n) {
		int rev=0;
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println("Calling reverse  method in primary package");
		return rev;
	}
}
