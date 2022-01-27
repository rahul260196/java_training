package com.statics.all;

public class Circle 
{

	public static void main(String[] args) 
	{
	   CircleArea obj = new CircleArea();
	   obj.CircleCalulatedArea();

	}

}

class CircleArea
{
	public void CircleCalulatedArea()
	{
		int r=5;
		double result=3.14*r*r;
		System.out.println("The area of circle is " +result);
	}
}
