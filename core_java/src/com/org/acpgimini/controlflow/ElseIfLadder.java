package com.org.acpgimini.controlflow;

public class ElseIfLadder {
	public static void main(String[] args) {
		int number=10;
		if(number<13)
			System.out.println("not a teen number");
		else if(number>=13 && number<=19)
			System.out.println("teeen number");
		else
			System.out.println("not a teen number");
	}

}  
