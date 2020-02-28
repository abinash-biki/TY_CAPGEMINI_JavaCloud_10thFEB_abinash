package com.org.acpgimini.methods;

public class MethodCallinngClass {
	public static void main(String[] args) {
		AreaCalculator cl=new AreaCalculator();
		System.out.println("area of the Squire  :"+cl.calculateAreaOfSquire(4));
		System.out.println("area of the rectangle :"+cl.calculateAreaOfRectangle(5, 6));
		System.out.println("area of the circle :"+cl.calculateAreaOfCircle(7));
	}

}
