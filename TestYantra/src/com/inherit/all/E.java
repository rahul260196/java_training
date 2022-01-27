package com.inherit.all;

class E extends D
{
	E(String s)
	{
		this(10.2);
		System.out.println(s);
	}
	
	E(double d)
	{
		super(10);
		System.out.println("10.2");
	}
}
