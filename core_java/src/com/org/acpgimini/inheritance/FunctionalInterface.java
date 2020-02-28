package com.org.acpgimini.inheritance;
public interface FunctionalInterface {
	public void showMessage();

	public static void printMessage()
	{
		System.out.println("public static void printMessage()");
	}
	default void displayMessage()
	{
	System.out.println("default void displayMessage()");
	}
	

}
