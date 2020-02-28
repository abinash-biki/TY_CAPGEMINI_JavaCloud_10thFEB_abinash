package com.org.acpgimini.inheritance;

import com.org.acpgimini.logopr.BasicArithmetic;

public class DifferentPackageMethod extends BasicArithmetic {
	public static void main(String[] args) {
		DifferentPackageMethod dm= new DifferentPackageMethod();
		System.out.println(dm.toString());
		System.out.println(dm.hashCode());
	//	BasicArithmetic.add(12, 34);
		System.out.println(add(23, 21));
		System.out.println(sub(23, 21));
		System.out.println(mul(23, 21));
		System.out.println(div(23, 21));
		
		
	}

}
