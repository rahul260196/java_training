package com.patterns.all;

public class InvertedHalfRightPyramid
{

	public static void main(String[] args)
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				
				if(j>=i)
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
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				
				if(i+j>6)
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
