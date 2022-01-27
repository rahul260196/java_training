package com.constructor.all;

public class Demo1
{

	public static void main(String[] args) 
	{
		int i=1, fact=1;
		while(i<=10)
		{
			fact=fact*i;
			System.out.println("The factorial of " +i + " is " +fact);
			i++;
		}

	}

}
