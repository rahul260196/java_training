package com.patterns.all;

public class RightTriangle {

	public static void main(String[] args) 
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			 System.out.println();
		}
		
		System.out.println();
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i>=j)
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			}
			 System.out.println();
		}


	}

}
