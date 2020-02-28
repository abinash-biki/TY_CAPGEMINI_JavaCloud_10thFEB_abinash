package com.org.acpgiminiloops;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("number");
		int n=scn.nextInt();
		int x=0;
		int y=1;
		System.out.println("for first n terms");
		for (int i = 1; i <=n ; i++) {
			System.out.print(x+",");
			int z=x+y;
			x=y;
			y=z;
		
			
		}
	}

}
