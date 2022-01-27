package com.methodoverride2.all;

class A
{
	void Lights()
	{
		System.out.println("halogen lights");
	}
}

class B extends A
{
	void Lights()
	{
		System.out.println("LED lights");
	}
}

public class Driver
{

	public static void main(String[] args)
	{
		B b1 = new B();
		b1.Lights();
		A a1 = new A();
		a1.Lights();
		A a2=b1;
		a2.Lights();
		
		

	}

}
