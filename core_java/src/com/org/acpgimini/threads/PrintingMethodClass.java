package com.org.acpgimini.threads;

public class PrintingMethodClass extends Thread {
	public void run()
	{
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
		}
	}
}
