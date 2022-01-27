package com.methodshadowing.all;

class A
{
	public static void A1()
	{
		System.out.println("super class method");
		
	}
}

class B extends A
{
	public static void A1()
	{
		System.out.println("sub class method");
		
	}
}
public class Driver {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        B b1 = new B();
        b1.A1();
        A obj=b1;
        obj.A1();
	}

}
