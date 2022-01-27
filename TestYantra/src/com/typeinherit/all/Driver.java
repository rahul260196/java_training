package com.typeinherit.all;

public class Driver 
{

	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.Add();
		b1.Add1();
		System.out.println(b1.i);
		System.out.println(b1.j);
		A a1 =new A();
		a1.Add();
		System.out.println(a1.i);
		

	}

}
