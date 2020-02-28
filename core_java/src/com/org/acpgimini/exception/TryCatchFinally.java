package com.org.acpgimini.exception;

public class TryCatchFinally {
public static void main(String[] args) {
	try {
		System.out.println(10/0);
		
	} catch (ArithmeticException e) {
		System.err.println("exception caught in the  code");
		//System.exit(0);
		// TODO: handle exception
	}catch (Exception e) {
		// TODO: handle exception
		
	}
	finally
	{
	System.out.println("code to be executed be  there any exception or not");
	}
	System.out.println("code is executed");
}
}
