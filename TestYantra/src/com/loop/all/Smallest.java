package com.loop.all;

public class Smallest
{

	public static void main(String[] args)
    {
		int a=4, b=3, c=1, d=2, result=0;
		if(a<b)
		{
			   if(a<c)
			   {
				      if(a<d)
				      {
					    result=a;
				      }
				      else
				      {
					   result=d;
				      }
			
			   }
			
			   else
			   {
				    if(c<d)
				    {
					  result=c;
				    }
				    else
				    {
					  result=d;
				    }
			   }
		}
		else
		{
			if(b<c)
			{
				if(b<d)
				{
					result =b;	
				}
				else
				{
					result=d;
				}
			}
				
			else
			{
				if(c<d)
				{
					result=c;
				}
				else
				{
					result=d;
				}
			}
		
		}
		
		
		
		System.out.println(result+" is the smallest no");

	}

}
