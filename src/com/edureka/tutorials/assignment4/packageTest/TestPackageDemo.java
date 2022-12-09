package com.edureka.tutorials.assignment4.packageTest;

import com.edureka.tutorials.assignment4.packages.PackageDemo;

public class TestPackageDemo {

	public static void main(String[] args) {
		PackageDemo obj=new PackageDemo();
		System.out.println(obj.add(2, 3));
		System.out.println(obj.sub(5, 3));
		System.out.println(obj.div(20, 10));
		System.out.println(obj.rev(123));
		System.out.println(obj.fact(3));
	}

}
