package com.org.acpgimini.logopr;

public class LogicalOpr {
public static void main(String[] args) {
	
	int i=10;
	int j=20;
	int k=30;
	System.out.println((i>j)&&(j>k));
	System.out.println((i>j)&&(j<k));
	System.out.println((i<j)&&(j<k));
	System.out.println((i<j)&&(j<k));
	System.out.println("-----------------------");
	System.out.println((i>j)||(j>k));
	System.out.println((i>j)||(j<k));
	System.out.println((i<j)||(j<k));
	System.out.println((i<j)||(j<k));
	System.out.println("-------------");
	System.out.println((i!=j));
	System.out.println((i!=k));
	
}
}
