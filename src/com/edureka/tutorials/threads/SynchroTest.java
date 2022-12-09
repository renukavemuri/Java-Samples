package com.edureka.tutorials.threads;

class Printer{
	//public void printTable(int n) {
	public synchronized void printTable(int n) {
		for(int i=1; i<=10; i++) {
			int p = n * i;
			System.out.println(Thread.currentThread().getName().toUpperCase()+ " --> " + n + " x " + i + " = " + p);
			try {
					Thread.sleep(1000);
				}catch(Exception ex) {}			
		}
		System.out.println();
		try {
			Thread.sleep(5000);
		}catch(Exception ex) {}		
	}
}

class Computer1Thread extends Thread{
	Printer printer;

	public Computer1Thread(Printer printer) {
		super();
		this.printer = printer;
	}
	
	public void run() {
		printer.printTable(5);
	}
}

class Computer2Thread extends Thread{
	Printer printer;

	public Computer2Thread(Printer printer) {
		super();
		this.printer = printer;
	}
	
	public void run() {
		printer.printTable(6);
	}
}
public class SynchroTest {

	public static void main(String[] args) {
		Printer printer = new Printer();
		
		Computer1Thread ct1 = new Computer1Thread(printer);
		Computer2Thread ct2 = new Computer2Thread(printer);
		
		ct1.setName("DOCUMENT-1");
		ct2.setName("DOCUMENT-2");
		
		ct1.start();
		ct2.start();
	}
}
