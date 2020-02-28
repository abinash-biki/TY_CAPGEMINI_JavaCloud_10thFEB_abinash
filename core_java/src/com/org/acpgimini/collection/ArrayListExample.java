package com.org.acpgimini.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
public static void main(String[] args) {
	ArrayList<Integer> arraylist =new ArrayList<Integer> (10);
	System.out.println("size of ArrayList="+arraylist.size());
	arraylist.add(18);
	arraylist.add(18);
	arraylist.add(13);
	arraylist.add(15);
	arraylist.add(181);
	arraylist.add(19);
	arraylist.add(10);
	arraylist.add(16);
	arraylist.add(156);
	arraylist.add(0, 12);
	
	System.out.println("size of ArrayList="+arraylist.size());
	
	for (Integer integer : arraylist) {
		System.out.println(integer);
		
	}
	System.out.println(arraylist);
	for (int i = 0; i < arraylist.size(); i++) {
		System.out.println(arraylist.get(i));
	}
	arraylist.remove(1);
	System.out.println(arraylist);
	Collections.sort(arraylist);
	System.out.println(arraylist);
	Collections.rotate(arraylist, arraylist.size());
}
}
