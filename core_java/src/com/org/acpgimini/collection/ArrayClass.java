package com.org.acpgimini.collection;

import java.util.Arrays;

public class ArrayClass {
	public static void main(String[] args) {
		int[] arr = { 12,34,21,3,4,43};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	int []arr2=	Arrays.copyOf(arr, 10);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		Arrays.fill(arr2, 7,9,987);
		for (int i = 0; i < arr2.length; i++) {
  
	}

	}
}
