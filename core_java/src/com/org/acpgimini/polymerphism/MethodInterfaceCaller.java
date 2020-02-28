package com.org.acpgimini.polymerphism;

public class MethodInterfaceCaller {
	public static void main(String[] args) {
		MethodoverridingClass1 mc1=new MethodoverridingClass1();
		MethodoverridingClass2  mc2=new MethodoverridingClass2 ();
		System.out.println(mc1.displayMessage());
		System.out.println(mc1.printMessage());
		System.out.println("-------------");
		System.out.println(mc2.displayMessage());
		System.out.println(mc2.printMessage());
	}
}
