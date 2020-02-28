package com.org.acpgimini.exception;

import java.io.FileReader;
import java.util.Properties;

public class CheckedException {
public static void main(String[] args) {
	Properties properties = new Properties();
	try {
		properties.load(new FileReader("application.properties"));
		// TODO: handle exception
	} catch (Exception e) {
		// TODO: handle exception
		System.err.println("exception is caught");
		e.printStackTrace();
	}
	finally {
		System.out.println("finally block");
		
	}
}
}
