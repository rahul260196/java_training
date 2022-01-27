package com.nonstatic.all;

public class Demo
{

	public static void main(String[] args) 
	{
		
      new Sample().demo1();
     System.out.println(new Sample().str); 
     
	}

}

class Sample
{
	String str="java";
	void demo1()
	{
		System.out.println("Object oriented");
	}
}
