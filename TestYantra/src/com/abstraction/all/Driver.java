package com.abstraction.all;

abstract class A
{
	void A()
	{
		System.out.println("add");
	}
	void A1()
	{
		System.out.println("1st method");
	}
	
	abstract void A2();
}

class B extends A
{
	
	
	void A2()
	{
		System.out.println("2nd method");
	}
}

public class Driver
{

	public static void main(String[] args)
	{
		B b1 = new B();
		b1.A();
		b1.A1();
		b1.A2();
		A a1= b1;//upcasting
		a1.A2();
		

	}

}
