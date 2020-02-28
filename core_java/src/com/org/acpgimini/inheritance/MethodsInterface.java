package com.org.acpgimini.inheritance;

public interface MethodsInterface {
     public void displayMessage();
     public void printMessage();
     public static void showMessage()
     {
    	 System.out.println("public static void showMessage()");
     }
	default void defaultMethodMessage()
	{
	System.out.println("defualt message()");
	}
	
}
