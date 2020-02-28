package com.org.acpgimini.exception;

public class ExceptionExamples {
public static void main(String[] args) {
	String string="";
	try {
	System.out.println(string.charAt(3 ));
	int i=10/0;
	System.out.println(i);
}catch (StringIndexOutOfBoundsException e) {
	e.printStackTrace();
	System.err.println("charAt(int inderx) should not be called at null string");
	System.out.println(e.getCause());
	System.out.println(e.getClass());
	System.err.println(e.getMessage());
	 //TODO: handle exception
}
	catch(ArithmeticException e)
	{
		System.err.println("should not divided by zero");  
		System.out.println(e.getCause());
		System.out.println(e.getClass());
		System.err.println(e.getMessage());
	}
		catch (Exception e) {
	  System.out.println("Exception caught in the code");
	}
	
}
}
 