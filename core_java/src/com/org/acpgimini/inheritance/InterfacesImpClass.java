package com.org.acpgimini.inheritance;

public class InterfacesImpClass implements MethodsInterface,MethodsInterface2 {

	@Override
	public void displayMessage() {
		System.out.println("Overriden  displayMessage()");
		
	}

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		System.out.println("override printMessage() ");
		
	}

	@Override
	public void messageDisplay() {
		// TODO Auto-generated method stub
		System.out.println("override display of anoher class");
		
	}
public static void main(String[] args) {
	//MethodsInterface i1=new InterfacesImpClass();
	//i1.displayMessage();
	//i1.printMessage();
	//MethodsInterface2 i2=new InterfacesImpClass();
	//i2.messageDisplay();
	InterfacesImpClass impcls =new InterfacesImpClass();
	impcls.displayMessage();
	impcls.messageDisplay();
	impcls.printMessage();
}
}
