package com.org.acpgimini.filehandeling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SetPropertiesExample {
public static void main(String[] args) throws IOException {
	Properties properties = new Properties();
	properties.put("batch", "java cloud");
	properties.put("Tech", "web basic ,java fyll statk ,java framework");
	properties.put("batchStringth", "28");
	properties.store(new FileWriter("batch.properties"), "batch details");
	System.out.println("created sucessfully");
}
}
