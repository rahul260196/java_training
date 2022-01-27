package com.trycatch.all;



public class Swinding 
{
	static void a()
	{
		int k=6/0;
		System.out.println(k);
		
	}
	
	static void b()
	{
		a();
	}
	
	static void c()
	{
		b();
	}
	
	
	public static void main  (String[] args) throws ArithmeticException
	{  
		c();
	}

}
