package com.org.acpgimini.methods;

public class MethodOverridingClass extends Methods {
	@Override
	public String printMessage(){
return "non static method overridingclass.printMessge";
}
	
	public static String displayMessage() {
		return "static method overridingclass.dispayMessge";
		
	}
	@Override
	int  adddingTwoIntegers(int i,int j)
	{
		return super.adddingTwoIntegers(i, j);
	}
	protected String welcomeMessage() {
		return super.welcomeMessage();
	}
	public static void main(String[] args) {
		System.out.println(new MethodOverridingClass().printMessage());
		System.out.println(displayMessage());
	}
}