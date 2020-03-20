package com.org.acpgimini.filehandeling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
 public static void main(String[] args) throws IOException {
	try(FileReader fileReader =new FileReader("newFile.txt");) {
		int charUnicode;
		while ((charUnicode=fileReader.read())!=-1) {
			System.out.print((char)charUnicode);
			
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
