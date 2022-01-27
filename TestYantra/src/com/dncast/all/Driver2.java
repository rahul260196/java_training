package com.dncast.all;

class D
{
	int i;	
}

class E extends D
{
	int j;
}

class F extends E
{
	int k;
}

public class Driver2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        D obj1 = new F(); //upcasting
        F f1 = (F) obj1;  //downcasting
        System.out.println(f1.k);
        E obj2= new F();
        F f2 = (F) obj2;
        System.out.println(f2.k);
        D obj3 = new F();
        F f3 = (F)obj3;
        System.out.println(f3.k);
        
	}

}
