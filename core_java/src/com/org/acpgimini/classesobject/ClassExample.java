package com.org.acpgimini.classesobject;

public class ClassExample {
	public ClassExample()
	{
		System.out.println("zero arg constructor");
    }
	public ClassExample(String string)
	{
		System.out.println("constructr with one argument");
	}
	public ClassExample(String string, int i)
	{
		System.out.println("one string and one int argument");
	}
	public ClassExample(int i,String string)
	{
		System.out.println("one int and one string arg");
	}
	public static void main(String[] args) {
		ClassExample cs=new ClassExample();
		ClassExample cs1=new ClassExample("anh");
		ClassExample cs2=new ClassExample("ajj",3);
		ClassExample cs3=new ClassExample(5,"was");
	}
	
	}
	