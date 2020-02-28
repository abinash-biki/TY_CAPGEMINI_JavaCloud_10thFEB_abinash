package com.org.acpgimini.threads;

public class PrintingValues {

	
	public static void main(String[] args) {
		System.out.println("++++++start++++++++");
		PrintingMethodClass prmc1=	new PrintingMethodClass();
		try {
			prmc1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prmc1.start();
		new PrintingValuesClass2().start();
		Thread thread=new Thread();
		try {
			thread.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		thread.start();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("+++++end+++++++");
	}
}
