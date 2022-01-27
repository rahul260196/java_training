package com.statics.all;

public class Triangle
{

	public static void main(String[] args)
	{
		
		Area obj = new Area();
		obj.CalculateArea();
	  

	}	
}

class Area
{
	public  void  CalculateArea()
	{
		int b=8;
		int h=12;
		double result=0.5*b*h;
		System.out.println("The area of the Triangle is " +result);
	}
}