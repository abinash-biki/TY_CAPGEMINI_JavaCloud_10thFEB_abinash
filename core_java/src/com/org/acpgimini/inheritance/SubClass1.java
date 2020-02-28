package com.org.acpgimini.inheritance;

public class SubClass1 extends SuperClass{
	@Override
public String print()
{
	return "some other string";
}
	public void display()
	{
		
		System.out.println("display() of sub clas6");
	}
	public static void main(String[] args) {
		SuperClass sp=new SuperClass();
	System.out.println(sp.print());
	
	SubClass1 sc=new SubClass1();
	System.out.println(sc.print());
	SuperClass sp1=new  SubClass1();//up-casting
	SubClass1 sb1=(SubClass1)sp1;//down-casting
	
	System.out.println(sp1.print());
	}
}
