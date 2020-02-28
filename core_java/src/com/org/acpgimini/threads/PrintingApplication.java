package com.org.acpgimini.threads;

public class PrintingApplication {
	public void PrintingDocuments(String document, int numOfCopies)
	{
		   
		for (int i = 0; i < numOfCopies ; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	  System.out.println(">>printing " +document+"#"+i);
	}
	}
}
