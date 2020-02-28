package com.org.acpgimini.exception;

import java.util.Scanner;

public class TrywithRes {
public static void main(String[] args) {
	
    try(Scanner scn = new Scanner(System.in)) {//scanner class implements closable interface and 
    	                                        //that interface has autoclose method so which ever class 
		                                          //implements closeable interface can be used inside try.
    	int i =10;
    	int j=scn.nextInt();
    	if(j==0)
    		System.out.println("shuld not divide");
    	else
    		System.out.println(i/j);
	} 
}
}
