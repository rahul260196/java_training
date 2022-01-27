package com.whileloop.all;

public class FactorialWhile 
{

	public static void main(String[] args) 
	{
	
			for(int j=1; j<=10; j++)
			{
		   
			
		    int fact=1; 
		     int i=j;
		        while(i>=1)
		        {
			     fact=fact*i;
			     i--;
		        }
		
		 System.out.println("The factorial of " +j+ " is " +fact);
		 
		}
		
		
		}
}
