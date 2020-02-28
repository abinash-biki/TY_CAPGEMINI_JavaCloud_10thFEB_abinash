package com.org.acpgimini.exception;

import java.util.Scanner;

public class CostoExceptionTester {
public static void main(String[] args)throws CostomException {
	Scanner scn=new Scanner(System.in);
	int number=scn.nextInt();
	if(number>=0 && number<=10) {
	System.out.println(number*10);
	}else
		throw new CostomException("custom");
}
}
///