package com.org.acpgimini.collection;

import java.util.HashMap;

public class HashMapExample {
public static void main(String[] args) {
	HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
	System.out.println("size of hashmap:"+hashMap.size());
	System.out.println("++++++++++");
	hashMap.put("1st key", 1);
	hashMap.put("2st key", 2);
	hashMap.put("3st key", 3);
	System.out.println("size of hash map after put():"+hashMap.size());
	System.out.println("++++++++++++++");
	System.out.println(hashMap);
	System.out.println("+++++++++=");
	System.out.println("isEmpty() on hashMap :"+hashMap.isEmpty());
	System.out.println("++++++++++++++++++");
	System.out.println("remove() on hashMap :"+hashMap.remove("4th key"));
	System.out.println("++++++++++++++++++");
	
}
}
