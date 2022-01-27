package com.rtpoly.all;
class Card
{
	void makePayment()
	{
		System.out.println("making payment");
	}
}

class DebitCard extends Card
{
	void makePayment()
	{
		System.out.println("making payment through debit card");
	} 
}

class CreditCard extends Card
{
	void makePayment()
	{
		System.out.println("making payment through credit card");
	}
}

class Swipe
{
	void swipingMachine(Card c)
	{
		c.makePayment();
	}
}
public class Driver 
{

	public static void main(String[] args) 
	{
		Swipe s = new Swipe();
		DebitCard d = new DebitCard();
		CreditCard c1 = new CreditCard();
		s.swipingMachine(d);//Upcasting and overriding

	}

}
