package com.methodshadowing.all;
class A1
{
	static int a=10;
	
	int b=20;
}

class B1 extends A1
{
	static int a=30;
	int b=40;
}

public class Driver2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		B1 b1 = new B1();
		System.out.println(b1.a);
		System.out.println(b1.b);
		A1 obj=b1;
		System.out.println(obj.a);
		System.out.println(obj.b);

	}

}
