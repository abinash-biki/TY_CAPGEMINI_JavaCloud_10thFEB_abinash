package com.org.acpgimini.classesobject;

public class ObjectClassMethod {
	public static void main(String[] args) {
		ObjectClassMethod oc=new ObjectClassMethod();
		ObjectClassMethod oc1=new ObjectClassMethod();
		System.out.println(oc.getClass());
		System.out.println(oc);
		System.out.println(oc.toString());
		System.out.println(oc1);
		System.out.println(oc1.toString());
		System.out.println(oc1.hashCode());
		System.out.println(oc.hashCode());
		System.out.println(oc.equals(oc1));
		
	}

}
