package com.whileloop.all;

public class Tree {

	public static void main(String[] args)
	{
		System.out.println("Happy X-Mas");
		int i;
		int j;
		int k;
		int height =3;
		int width =4;
		int space=width*5;
		int r;
		int m=1;
		  
		for(r=1;r<=height;r++)
		{
			for(i=m; i<=width; i++)
			{
				for(j=space; j>=i;j--)
				{
					System.out.print(" ");
				}
				
				for(k=1;k<=i;k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			
			m+=2;
			width +=2;
		}
		
		
		
		for(i=1; i<=4; i++)
		{
			for(j=space-3; j>=1; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=4; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		

	}

}
