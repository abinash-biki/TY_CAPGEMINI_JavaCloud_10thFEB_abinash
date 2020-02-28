package com.org.acpgimini.strings;

public class StringBufferEx {
public static void main(String[] args) {
	String s1="abinnash";
	StringBuffer sb= new StringBuffer(s1);
	System.out.println(sb.getClass());
	System.out.println(sb.length());
	sb.append("buffer");
	System.out.println(sb);
	System.out.println(sb.reverse());
	System.out.println(sb.reverse());
	System.out.println(sb.replace(0, 9, "S")); 
	System.out.println(sb.insert(3, "abc"));//sb.insert(3, "abc")
	System.out.println(sb.indexOf("abc"));
	System.out.println(sb.delete(2,4));
}
}
