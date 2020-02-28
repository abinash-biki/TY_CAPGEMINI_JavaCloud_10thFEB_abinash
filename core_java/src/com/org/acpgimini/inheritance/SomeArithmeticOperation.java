package com.org.acpgimini.inheritance;

import com.org.acpgimini.logopr.BasicArithmetic;

public class SomeArithmeticOperation extends BasicArithmetic {
	
	public SomeArithmeticOperation()
	{
		super("abc");
		System.out.println("some arithemetic contructor");
	}
	
	
	public static void main(String[] args) {
		SomeArithmeticOperation so=new SomeArithmeticOperation();
		System.out.println(add(12, 32));                     
		System.out.println(sub(12, 32));
		System.out.println(mul(12, 32));
		System.out.println(div(12, 32));
	}

}
