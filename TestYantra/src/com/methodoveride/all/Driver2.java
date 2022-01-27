package com.methodoveride.all;
class A
{
	int i;
}

class B extends A
{

	int j;
	
}

public class Driver2 
{

	public static void main(String[] args) 
	{
		
         B b1 = new B();
         System.out.println(b1.i);
         System.out.println(b1.j);   
         A a1 = new A();
         System.out.println(a1.i);
         System.out.println(a1);
        System.out.println(b1);
        
         A a2=b1;
         System.out.println(a2);
         System.out.println(a2.i);
       //  System.out.println(a2.j);
         
	}

}
