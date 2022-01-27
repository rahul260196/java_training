package com.trycatch.all;

import java.util.Scanner;

public class CustomExceptionExample
{

	public static void main(String[] args) throws UnderAgeException
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		try
		{
		if(age<=21)
		{
		   throw new UnderAgeException("age is underage ");
		}
		
		else
		{
		 System.out.println("show profiles");	
		}
		
		}
		catch(UnderAgeException u)
		{
			System.out.println("Exception occured but it is handled: "+u.getMessage());
		}
		
		

	}

}

class UnderAgeException extends Exception{
	String ErrorMessage;
	UnderAgeException(String ErrorMessage)
	{
		this.ErrorMessage=ErrorMessage;
	}
	
	public String getMessage()
	{
		return ErrorMessage;
	}
}
