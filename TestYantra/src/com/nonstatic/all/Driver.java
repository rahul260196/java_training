package com.nonstatic.all;

public class Driver
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		A a1 = new A();
		a1.a=10;
		a1.b=20;
		a1.c=30;
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
		
		a1.Add(20, 30, 50);
		System.out.println(a1.sum);
		

	}

	
}
 class A
{
	    int a;
		int b;
		int c;
		int sum=0;
		public void Add(int a, int b, int c)
		{
			this.a =a;
			this.b =b;
			this.c =c;
			sum=a+b+c;
			System.out.println(sum);
		}
	
}


