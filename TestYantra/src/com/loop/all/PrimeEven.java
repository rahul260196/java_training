package com.loop.all;

public class PrimeEven
{

	public static void main(String[] args)
	{   
		
		for(int i=2; i<10; i++)
		{
			int count=0, flag=0;
			for(int j=2; j<i; j++)
			{
				
				if(i%j==0)
				{
					count=1;
				}
			} 
			
			if(i%2==0)
			{
				flag=1;
			}

			if(count==0 && flag==1)
			{
				System.out.println(i+"is a  even prime number");
			}
		}
		

			
			

		
		
		
		
		
	}
		
	}

