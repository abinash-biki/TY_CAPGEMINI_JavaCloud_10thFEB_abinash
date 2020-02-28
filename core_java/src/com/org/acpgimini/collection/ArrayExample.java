package com.org.acpgimini.collection;

public class ArrayExample {
public static void main(String[] args) {
	int [] arr=new int[6];
	long []arr1={12,34,56,78,32,4};
	//int arr1[]=new int[6];//not the proper way of creating array.
	
	arr[0]=1;
	arr[1]=2;
	arr[2]=4;
	arr[3]=5;  
	arr[4]=Integer.parseInt("123");
	//arr[5]=7;
	for (int i = 0; i < arr.length; i++) {
		System.out.println("element at index :"+ i +"="+arr[i]);
	}
	System.out.println("----------------");
for (long i : arr1) {
	System.out.println(i);
}
	
}
}
