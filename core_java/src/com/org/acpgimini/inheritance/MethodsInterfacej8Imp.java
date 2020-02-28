package com.org.acpgimini.inheritance;

public class MethodsInterfacej8Imp implements MethodsInterface {

	@Override
	public void displayMessage() {
		// TODO Auto-generated method stub
		System.out.println("public void displayMessage() ");
	}

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		System.out.println("public void printMessage()");
	}

	public static void main(String[] args) {
		MethodsInterfacej8Imp imp=new MethodsInterfacej8Imp();
		imp.displayMessage();
		imp.printMessage();
		imp.defaultMethodMessage();
		
	}
}
