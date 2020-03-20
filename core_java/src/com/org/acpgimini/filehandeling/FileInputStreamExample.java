package com.org.acpgimini.filehandeling;

import java.io.FileInputStream;

public class FileInputStreamExample {
public static void main(String[] args) {
	try(	FileInputStream fileInputStream = new FileInputStream("222.png");
) {
		int imgCode=0;
		while((imgCode =fileInputStream.read())!=-1)
		{
			System.out.println(imgCode);
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
