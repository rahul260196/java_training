package com.methodoveride.all;

class C
{
	public void C1()
	{
		System.out.println("super class method");
	}
}

class D extends C
{
	public void C1()
	{
		System.out.println("sub class method");
	}
}
public class Driver 
{

	public static void main(String[] args)
	{
		D d1 = new D();
		d1.C1();
		C c1 = new C();
		c1.C1();
		C c2=d1;
		c2.C1();


	}

}
