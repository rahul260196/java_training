package com.statics.all;


public class Demo
{

	public static void main(String[] args) 
	{
		Sample.method_static();
		System.out.println(Sample.ch);	
	}

}

class Sample
{
   static char ch='A';
   public static void method_static()
   {
	   System.out.println("We are learning static");
	   
   }
}