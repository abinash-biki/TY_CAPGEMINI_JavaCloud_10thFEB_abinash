package com.org.acpgimini.logopr;

public class BasicArithmetic {  
public	 BasicArithmetic()
{
	System.out.println("basic atithmetc");
	}
public	 BasicArithmetic(String s)
{
System.out.println("basic with string argument");
}

	/**
	 *this method returns the sum of two given integers..
	 * @param i
	 * @param j
	 * @return  i+  j;
	 * 
	 */
	
	public static int add(int i,int j)
	{
		int sum;
		sum=i+j;
		return sum;
		
	
}
	/**
	 *this method returns the sub of two given integers..
	 * @param i
	 * @param j
	 * @return  i- j;
	 * 
	 */
	public static  int sub( int i,int j) {
		
		return i-j;
		
	}
	/**
	 *this method returns the div of two given integers..
	 * @param i
	 * @param j
	 * @return  i/j;
	 * 
	 */
	public static double div(int i, double j) {
		
		return i/j;
	}
	/**
	 *this method returns the mul of two given integers..
	 * @param i
	 * @param j
	 * @return  i*j;
	 * 
	 */
	public static int mul(int i,int j) {
		
		return i*j;
	}
	public static void main(String[] args) {
		int a=add(23,45);
		System.out.println(a);
		System.out.println(add(12,34));
		System.out.println(sub(34,11));
		System.out.println(div(34,5));
		System.out.println(mul(4,6));
	}

}
