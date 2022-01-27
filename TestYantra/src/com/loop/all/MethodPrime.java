package com.loop.all;

public class MethodPrime 
{

	public static void main(String[] args) 
	{
		Prime();
		NotPrime();
		
	}
	
	 public static void Prime()
	 {
		 System.out.println("Prime numbers given below");
		 for(int i=2; i<=100; i++)
			{
				 boolean flag =true;
			      for(int j=2; j<i; j++)
			      {
			    	  if(i%j==0)
			    	  {
			    		  flag = false;
			    		  
			    	  }
			      }
			      if(flag ==true)
			      {
			    	  System.out.println(i+" is a prime number");
			      }
			}
		 
		 
	 }
	 
	 public static void NotPrime()
	 {
		 System.out.println("Non-Prime numbers are given below");
		 for(int i=2; i<=100; i++)
			{
				 boolean flag =false;
			      for(int j=2; j<i; j++)
			      {
			    	  if(i%j ==0)
			    	  {
			    		  flag = true;
			    		  
			    	  }
			      }
			      if(flag ==true)
			      {
			    	  System.out.println(i+" is not aprime number");
			      }
			}
	 }

	}

   
