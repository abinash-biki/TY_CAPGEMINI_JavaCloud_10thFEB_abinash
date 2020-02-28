package com.org.acpgimini.exception;

import java.io.FileReader;
import java.util.Properties;

public class ThrowsAndThrow {
public static void main(String[] args)  throws Exception {
	new Properties().load(new FileReader("application.properties"));
}
}
    