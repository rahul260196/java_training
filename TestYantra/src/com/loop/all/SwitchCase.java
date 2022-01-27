package com.loop.all;

public class SwitchCase 
{

	public static void main(String[] args)
	{
		char input='Z';
		switch(input)
		{
		case 'X': System.out.println("is my initial");
		break;
		case 'Y': System.out.println("My initial is :" +input);
		break;
		case 'Z': System.out.println("is my sec initial");
        break;
        default:  System.out.println("My initial is not present");
		}

	}

}
