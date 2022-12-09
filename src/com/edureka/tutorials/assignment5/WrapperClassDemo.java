package com.edureka.tutorials.assignment5;

public class WrapperClassDemo {

	public static void main(String[] args) {
		Integer i=10;
		while(i!=0) {
		System.out.println(i.intValue());
		}
		
		String str="edureka";
		while(str!=null) {
		System.out.println(str.charAt(0));
		}
		
		Boolean boo=true;
		while(boo==true) {
		System.out.println(boo.booleanValue());
		}
		
		Character ch='A';
		while(ch!=null) {
			System.out.println(ch.charValue());
		}
		
		Byte b=10;
		while(b>0) {
			System.out.println(b.byteValue());
		}
		
		Double db=10.00;
		while(db>0) {
			System.out.println(db.doubleValue());
		}
		}
		

	}


