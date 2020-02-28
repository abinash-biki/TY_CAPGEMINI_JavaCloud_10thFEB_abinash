package com.org.acpgimini.methods;

public class VargsInputExample {
public int add(int...input)
{
	int sum=0;
	for (int i = 0; i < input.length; i++) {
		sum+=input[i];
	}
return sum;      
}
public static void main(String[] args)
{
 System.out.println("sum of all the arguments:"+new VargsInputExample().add(1,34,54,3));
}
}
