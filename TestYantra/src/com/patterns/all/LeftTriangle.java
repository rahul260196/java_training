package com.patterns.all;

public class LeftTriangle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i=1; i<=4; i++)
		{
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		int k=4;
		for(int i=1; i<=k; i++)
		{
			for (int j=1; j<=k-i; j++)
			{
				System.out.print(" ");
				
			}
			for(int j=k; j>k-i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		 

	}

}
