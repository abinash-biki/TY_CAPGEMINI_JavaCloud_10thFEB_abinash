package com.org.acpgimini.collection;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<String>();
		System.out.println(linkedList.size());
		System.out.println("**************");
		linkedList.add("1st");
		linkedList.add("2st");
		linkedList.add("3st");
		linkedList.add("4st");
		System.out.println("size of linked list after add:"+linkedList.size());
		System.out.println("*************");
		System.out.println(linkedList);
		System.out.println("*****************");
		linkedList.add("0th");
		linkedList.add("5th");
		System.out.println("sixe of linllklist after add:"+linkedList.size());
		System.out.println("****************");
		System.out.println("linledlist after add first and add last");
		System.out.println(linkedList);
		System.out.println("*************************");
		System.out.println("linkedlist peek():"+linkedList.peek());
		System.out.println("*******************");
		System.out.println("linkedlist peekFirst:"+linkedList.peekFirst());
		System.out.println("***************");
		System.out.println("linkedlist peekLast:"+linkedList.peekLast());
		System.out.println("***************");
		System.out.println("linkedlist pool():"+linkedList.poll());
		System.out.println("*******************");
		System.out.println("linkedlist poolFirst:"+linkedList.pollFirst());
		System.out.println("***************");
		System.out.println("linkedlist poolLast:"+linkedList.pollLast());
		System.out.println("***************");
		
		
	}

}
