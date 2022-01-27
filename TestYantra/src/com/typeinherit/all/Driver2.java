package com.typeinherit.all;

public class Driver2 
{

	public static void main(String[] args)
	{
		F f1 = new F();
		System.out.println(f1.p);
		System.out.println(f1.n);
		System.out.println(f1.k);
		f1.add2();
		f1.add1();
		f1.add();
		E e1 = new E();
		
		System.out.println(e1.n);
		System.out.println(e1.j);
		e1.add1();
		e1.add();
		D d1 = new D();
		System.out.println(d1.j);
		d1.add();

	}

}
