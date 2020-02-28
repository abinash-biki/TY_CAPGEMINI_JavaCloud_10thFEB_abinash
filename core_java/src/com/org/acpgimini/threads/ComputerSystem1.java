package com.org.acpgimini.threads;

public class ComputerSystem1  extends Thread{
 
	PrintingApplication printingApplication;
	public ComputerSystem1(PrintingApplication localPrintingApplication)
	{
	 this.printingApplication =localPrintingApplication;
	}
	@Override
	public void run()
	{
	System.err.println("printinng from computer 1");
	printingApplication.PrintingDocuments("pff", 10);
	}
}
