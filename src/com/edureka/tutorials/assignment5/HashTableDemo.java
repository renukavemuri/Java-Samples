package com.edureka.tutorials.assignment5;

import java.util.Collections;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, Integer> student=new Hashtable<String,Integer>();
		
		student.put("test1",98);
		student.put("test2",89);
		student.put("test3",88);
		student.put("test4",78);
		student.put("test5",99);
		
		System.out.println(student);
		
		int max = Collections.max(student.values());
		
		System.out.println("student with highest marks in the class" +max);
			
	}

}
