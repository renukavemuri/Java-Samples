package com.edureka.tutorials.assignment5;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Float> employee=new HashMap<String, Float>();
		
		employee.put("Sunitha", 25000f);
		employee.put("Aparna", 12000f);
		employee.put("Bhavana", 17000f);
		employee.put("Hussain", 15000f);
		employee.put("Pankaj", 27000f);
		
		System.out.println("Employee records :" +employee);
	}
}
