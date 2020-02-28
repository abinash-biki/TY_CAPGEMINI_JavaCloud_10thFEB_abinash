package com.org.acpgimini.collection;

import java.util.Collections;

public class CustomListExecute {
	public static void main(String[] args) {
		CustomList customList =new CustomList(4);
		customList.add("2");
		customList.add("3");
		customList.add("5");
		customList.add("9");
		customList.add("5");
		customList.add("6");

		System.out.println("customList size:" +customList.size());
		
		for (int i = 0; i < customList.size(); i++) {
			System.out.println("elements at"+i+"index :"+customList.get(i));
		}
		System.out.println(customList.getIndex("6"));
	}

}
