package com.org.acpgimini.exception;

public class TryFinally {
public static void main(String[] args) {
	try {
		System.out.println(10/0);
	} finally {
		System.out.println("code inside finally block");
		// TODO: handle exception
	}
}
}
