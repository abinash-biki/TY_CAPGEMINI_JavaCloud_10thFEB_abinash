package com.org.acpgimini.strings;

public class StringMethods {
public static void main(String[] args) {
	String s1="some string";
	String s2="";
	String s3="SoMe sTrInG";
	int length=s1.length();

	System.out.println(length);
	System.out.println(s1.isEmpty());
	System.out.println(s2.length());
	System.out.println(s2.isEmpty());
	System.out.println(s1.charAt(5));
	System.out.println(s1.charAt(s1.length()-1));//the index value always starts with zero and the kength vakue always starts with one so if we will give the complete lenghth then it will ive runtime exceptiion saying index outodf bounds.
	System.out.println(s1.equals(s3));
	System.out.println(s1.equalsIgnoreCase(s3));
	System.out.println(s1.concat("abinash"));//it will concatinate the older string with the new string
	System.out.println(s1);
	s1=s1.concat("abinash");
	System.out.println(s1);
	s3=s1.replace('s', 'q');
	
	System.out.println(s1);//string is imuatable thats why the value of the string did not changed
	System.out.println(s3);//here we re assigning the the value to a new string so it will chnge its value
	
	String s6=s1.valueOf(1234);
	System.out.println(s6);
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toCharArray());
	System.out.println(s1.substring(6));
	System.out.println(s1.substring(5, 9));
	System.out.println("starts with: "+s1.startsWith("a"));
	System.out.println("ends with: "+s1.endsWith("ash"));
	System.out.println(s1);
	
}
}
