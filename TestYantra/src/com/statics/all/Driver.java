package com.statics.all;
class C
{
	static int a;
	static int b;
	static int c;
	public static void Add(int a, int b, int c)
	{
		int sum=0;
		sum=a+b+c;
		System.out.println(sum);
	}
}

public class Driver 
{

	public static void main(String[] args) 
	{
		C.a=10;
		C.b=20;
		C.c=30;
		C c1 = new C();
		System.out.println(C.b);
		System.out.println(c1.b);

	}

}
