package com.org.acpgimini.exception;

import java.util.Scanner;

public class CustomExceptionTester {
public static void main(String[] args) throws InvalidNumberCustomException {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a number");
	int number=scn.nextInt();
	scn.close();
	try {
		
	} catch (Exception e) {
		throw new InvalidNumberCustomException("abinash");
		// TODO: handle exception
	}
}
}
