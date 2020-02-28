package com.org.acpgimini.methods;

import java.util.ArrayList;

public class ArrayListExample {
public static void main(String[] args) {
	ArrayList<Integer> arrayList =new ArrayList<Integer>();
	arrayList.add(12);
	arrayList.add(0, 44);
	System.out.println("Size of ArrayList"+arrayList.size());
	//for (Integer integer : arrayList) {
	//	System.out.println(integer);
	//}
	
	System.out.println(arrayList.get(0));
	System.out.println(arrayList.get(1));
}
}
