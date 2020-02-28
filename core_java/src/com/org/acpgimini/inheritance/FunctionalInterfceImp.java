package com.org.acpgimini.inheritance;

public class FunctionalInterfceImp implements FunctionalInterface {

	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("@Overrideen showMessage() of uncctional interface ");
	}
	 public static void main(String[] args) {
		FunctionalInterfceImp imp=new FunctionalInterfceImp();
		imp.showMessage();
		imp.displayMessage();
	}
	
}
