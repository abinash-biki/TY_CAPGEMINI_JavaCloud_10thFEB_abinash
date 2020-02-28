package com.org.acpgimini.inheritance;

public class FunctionalInterfaceImpl implements FunctionalInterface,MethodsInterface {

	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("show message");
	}
	public int add(int i,int j)
	{
	 return i+j;
	}
	@Override
	public void displayMessage() {
		// TODO Auto-generated method stub
		System.out.println("display message");  
	}
	public static void main(String[] args) {
		FunctionalInterfaceImpl imp=new FunctionalInterfaceImpl();
		System.out.println(imp.add(23, 45));
		imp.displayMessage();
		imp.printMessage();
		
		
	}
	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		System.out.println("printmessage");
	}

}
