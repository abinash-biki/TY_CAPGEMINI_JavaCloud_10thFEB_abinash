package com.org.acpgimini.inheritance;

public class SubClass2 extends SubClass1 {
@Override
public void display() {
	// TODO Auto-generated method stub
	super.display();
	super.i=12;
	
	System.out.println("Overridden display( )in subclass");
}

@Override
	public String print() {
		// TODO Auto-generated method stub
	System.out.println("Overridden print of super class in subclass");
		return super.print();
	}
int j=super.i;
public static void main(String[] args) {
	SubClass2 s1=new SubClass2();
	s1.display();
	System.out.println(s1.print());
	System.out.println(s1.i);
}
}
