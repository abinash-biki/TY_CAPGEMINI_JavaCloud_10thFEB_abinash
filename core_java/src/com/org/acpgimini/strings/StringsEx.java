package com.org.acpgimini.strings;

public class StringsEx {
public static void main(String[] args) {
	String s1="some string";   
	String s2=new String("Some other string");
	String s3="some other string";;
	String s4="some string";   
	String s5=new String("Some other string");
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s4.hashCode());
	System.out.println(s5.hashCode());
	System.out.println(s1.equals(s4));
	System.out.println(s2.equals(s5));
}

}
