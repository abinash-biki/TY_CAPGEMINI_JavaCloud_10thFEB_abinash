package com.org.acpgimini.classesobject;

public class MethodOverloading {
public static void displayMessage() {
	System.out.println("public static void displayMessage");
}
public static void displayMessage(String string)
{
	System.out.println("public static void displayMessage(String string)");
}
public  void displayMessage(String string,int i)
{
	System.out.println("public static void displayMessage(String string,int i)");
}
public static void displayMessage(int i,String string)
{
	System.out.println("public static void displayMessage(int i,String string)");
}
public static void main(String[] args) {
	displayMessage();
	MethodOverloading.displayMessage("ajdj");
	MethodOverloading mc=new MethodOverloading();
	mc.displayMessage("aadd",1);
	mc.displayMessage(2, "ann");
	mc.getClass();
	
}
}
