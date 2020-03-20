package com.org.acpgimini.filehandeling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileExample {
public static void main(String[] args) {
	Properties properties=new Properties();
	try {
		properties.load(new FileReader("application.properties"));
		System.out.println(properties.getProperty("name"));
		properties.setProperty("batch","java");
		System.out.println(properties.getProperty("batch"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
