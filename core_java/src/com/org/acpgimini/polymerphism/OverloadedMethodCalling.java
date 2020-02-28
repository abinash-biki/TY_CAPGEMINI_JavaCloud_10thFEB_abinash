package com.org.acpgimini.polymerphism;

public class OverloadedMethodCalling {
public static void main(String[] args) {
	OverloadedMethodClass omc= new OverloadedMethodClass();
	System.out.println("with three arguments:"+omc.add(12, 34,34));
	System.out.println("with two arguments :"+omc.add(76,32));
	System.out.println("with one double and one int argument :"+omc.add(4.9, 90));
	System.out.println("with one integer and one double argument :"+omc.add(33,43.9));
}
}
