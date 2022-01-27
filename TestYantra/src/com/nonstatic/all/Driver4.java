package com.nonstatic.all;

class Parent
{
	int i;
}

class Child extends Parent
{
	int j;
}

class Subchild extends Child
{
	int k;
}
public class Driver4 {

	public static void main(String[] args) 
	{
		Subchild s1 = new Subchild();
		System.out.println(s1.i);
		System.out.println(s1.j);
		System.out.println(s1.k);
		Child c1 = new Child();
		System.out.println(c1.i);
		System.out.println(c1.j);
		//System.out.println(c1.k);
		Parent p1 = new Parent();
		System.out.println(p1.i);
		//System.out.println(p1.j);
		//System.out.println(p1.k);
		
		Child c2=s1;
		Subchild s2 = (Subchild)c2;
		System.out.println(s2.k);
		
		Parent p2 = s1;
		Subchild s3 = (Subchild)p2;
		System.out.println(s3.k);
		System.out.println(s3.j);
		
		Parent p3=c1;
		Child c3 = (Child)p3;
		System.out.println(c3.j);

	}

}
