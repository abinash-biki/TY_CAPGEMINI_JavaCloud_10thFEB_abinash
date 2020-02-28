package com.org.acpgiminiloops;

public class LoopExamples {
	public static void main(String[] args) {
		int i=0;
		for (int j = 1; j <= 10; j++) {
			System.out.println(j*13);
			
		}
		for (; i < 10; i++) {
			System.out.println(i);
		}
		for (int k = 0; true; k++) {
			System.out.println(k);
		}
	}

}
