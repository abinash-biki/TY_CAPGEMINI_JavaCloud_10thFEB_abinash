package com.org.acpgimini.filehandeling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample  {
	public static void main(String[] args) throws IOException {
		
	

try (FileWriter fileWriter = new FileWriter("newFile.txt");){
	fileWriter.write("the is the filewriter example for writing data ");
	//fileWriter.write("the is the filewriter example for writing data again");
	fileWriter.append("file is added ");
	System.out.println("created sucessfully");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}