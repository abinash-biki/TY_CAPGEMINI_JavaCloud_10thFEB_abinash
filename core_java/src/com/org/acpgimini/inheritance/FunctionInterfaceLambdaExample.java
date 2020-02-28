package com.org.acpgimini.inheritance;

public class FunctionInterfaceLambdaExample {
   static String s1="FunctionInterfaceLambdaExample";
   static FunctionalInterface f1=
		   () ->{ 
			   System.out.println(s1);
		   };
		   
		   public static void main(String[] args) {
			f1.displayMessage();
		}
}
