package com.hierarinherit.all;

class A
{  
	int i;
	int j;
	
}

class B extends A
{
	int k;
}

class C extends A
{
	int l;

}

class D extends A
{
	int m;
}

public class Driver 
{

	public static void main(String[] args) 
	{
	   D d1 = new D();
	   System.out.println(d1.m);
	   System.out.println(d1.i);
	   System.out.println(d1.j);
	   A a1 = new A();
	   System.out.println(a1.i);
	   System.out.println(a1.j);
	  // System.out.println(a1.m);
	   C c1 = new C();
	  // System.out.println(c1.m);
	   System.out.println(c1.l);
	   System.out.println(c1.i);
	   System.out.println(c1.j);
	   B b1 = new B();
	   System.out.println(b1.k);
	   System.out.println(b1.i);
	 //  System.out.println(b1.l);

	}

}
