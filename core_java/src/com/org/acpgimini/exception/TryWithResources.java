package com.org.acpgimini.exception;

import java.util.Scanner;

public class TryWithResources {
public static void main(String[] args) {
	
	try(Scanner scanner = new Scanner(System.in)) {
		System.out.println("try");
		int i=10;
		int j=scanner.nextInt();
		System.out.println(i/j);
		
	} catch (Exception e) {
		System.err.println("should not divide the number with zero");
		System.err.println();
		// TODO: handle exception
	}
}
}

