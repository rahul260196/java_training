package com.methodoverride2.all;
class Mobile
{
	void camera()
	{
		System.out.println("no camera");
	}
}

class Nokia extends Mobile
{
	void camera()
	{
		System.out.println(" 1 camera");
	}
}

class Iphone extends Mobile
{
	void camera()
	{
		System.out.println("3 camera");
	}
}




public class Driver2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Mobile m=new Mobile();
		m.camera();
		Nokia n= new Nokia();
		n.camera();
		Iphone i = new Iphone();
		i.camera();
		Mobile m1=i;
		m1.camera();
		Mobile m2=new Iphone();
		m2.camera();// after doing upcasting the sub class method override the super class.

	}

}
