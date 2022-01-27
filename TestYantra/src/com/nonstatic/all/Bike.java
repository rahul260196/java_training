package com.nonstatic.all;

public class Bike
{
	String name;
	String brand;
	int cc;
	  Bike(String name, String brand, int cc)
	  {
		  this.name=name;
		  this.brand=brand;
		  this.cc=cc;
		  System.out.println(this.name);// accessing global variable
		  System.out.println(this.brand);// accessing global variable
		  System.out.println(this.cc);// accesssing global variable
				  
	  }
	  
	 
	  

	public static void main(String[] args)
	{
		Bike b= new Bike("Duke", "KTM", 380);
		Bike c=new Bike("Pulsar", "Bjaj", 250);

	}

}
