package com.edureka.tutorials.assignment4.interfaces;

public class QueueInterfaceImpl implements QueueInterface{
	@Override
	public void insert(int a) {
		System.out.println("insert elements" +a);
	}
	@Override
	public void delete(int b) {
		System.out.println("delete elements" +b);
	}
	
	
	public static void main(String[] args) {
		QueueInterfaceImpl obj=new QueueInterfaceImpl();
		obj.insert(1);
		System.out.println(" \n ");
		
		obj.delete(1);
		
		System.out.println(" \n ");
	}
}
