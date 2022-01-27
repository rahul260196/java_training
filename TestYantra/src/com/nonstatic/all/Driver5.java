package com.nonstatic.all;
class Parent1
{
	int i;
	void test()
	{
		System.out.println("test");
	}
}

class Child1 extends Parent1
{
	int j;
	void test()
	{
		System.out.println("no-test");
	}
}


public class Driver5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1 = new Child1();
		System.out.println(c1.j);
		c1.test();
		Parent1 p1 = new Parent1();
		p1.test();
		Parent1 p2=c1;
		p2.test();
		
		
		

	}

}
