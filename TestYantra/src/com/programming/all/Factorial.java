package com.programming.all;

public class Factorial 
{

	public static void main(String[] args) 
	{
		int n=5; 
		int fact=1;
		for(int i=n; i>=1; i--)
		{
			fact=fact*i;
		}
       System.out.println("the factorial of " +n+ "is "+fact);
	}

}
