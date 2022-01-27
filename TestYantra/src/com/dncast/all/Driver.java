package com.dncast.all;
class A
{
	int i;
}

class B extends A
{
	int j;
}

class C extends B
{
	int k;
}

public class Driver
{

	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println(c1.i);//0
		System.out.println(c1.j);//0
		System.out.println(c1.k);//0
		B b1 = new B();
		System.out.println(b1.i);//0
		System.out.println(b1.j);//0
		//System.out.println(b1.k);//cte
		A a1 = new A();
		System.out.println(a1.i);//0
		//System.out.println(a1.j);//cte
		//System.out.println(a1.k);//cte
		//A a2 = b1; //upcasting
		//System.out.println(a2.j);//cte
	//	B b2=(B)a2;
	//	System.out.println(b2.j);
		//A a2=new A();
		//B b2 = (B)a2;
		//System.out.println(b2.j);
		//A a3 = new C();
		//System.out.println(a3.k);
		//C c2=(C)a3;
		//System.out.println(c2.k);
		//System.out.println(a3);
		//System.out.println(c1);
		A a3 = new C();
		C c2=(C)a3;
		System.out.println(c2.k);
		
		
		
 
	}

}
