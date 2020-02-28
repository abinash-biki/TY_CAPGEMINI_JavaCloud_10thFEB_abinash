package com.org.acpgimini.inheritance;

import com.org.acpgimini.methods.Method;
import com.org.acpgimini.methods.Methods;

public class DifferentPackageMethodOverridingClass extends Methods {
@Override
public String printMessage() {
	// TODO Auto-generated method stub
	return "DifferentPackageMethodOverridingClass";
}
@Override
	protected String welcomeMessage() {
		// TODO Auto-generated method stub
		return "hello welcome";
	}
public static void main(String[] args) {
	DifferentPackageMethodOverridingClass di= new DifferentPackageMethodOverridingClass();
	System.out.println(di.printMessage());
	System.out.println(di.welcomeMessage());
}
}
