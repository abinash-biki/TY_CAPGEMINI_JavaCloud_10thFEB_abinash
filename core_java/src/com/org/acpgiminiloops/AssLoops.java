package com.org.acpgiminiloops;

public class AssLoops {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if(i%2==0)
			{
				for(int j=0;j<i;j++)
				System.out.println(" is even"+i);
			}
			else
				System.out.println(" is odd");
		}
	}

}
