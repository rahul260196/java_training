package com.trycatch.all;

public class Demo 
{

	public static void main(String[] args)
	{
		int i, j, k=0;
		i=5;
		j=0;
		try
		{
		  	k=i/j;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled" +e);
		}

		System.out.println(k);
	}

}
