package com.org.acpgimini.filehandeling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample2 {
public static void main(String[] args) {
	try (FileWriter fileWriter = new FileWriter("newFile1.txt");){
		fileWriter.write("2nd file is created ");
		System.out.println("created sucessfully");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
