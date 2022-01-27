package com.patterns.all;

public class LeftTriangleAlphabet 
{

	public static void main(String[] args)
	{
		char ch='A';
		for (int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(ch);
				ch++;
				
			}
			System.out.println();
		}
		
		int k=65;
		for (int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)k);
				k++;
				
			}
			System.out.println();
		}

	}

}
