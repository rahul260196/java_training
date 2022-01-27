package com.array.all;

import java.util.Scanner;

public class ArrayNew
{

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int[] a= new int[size];
		System.out.println("Enter values");
		for(int j=0; j<a.length;j++)
		{
			a[j]=sc.nextInt();
			
		}
		System.out.println("The Elements stored in array are below");
		for(int k=0; k<a.length;k++)
		{
			System.out.println(a[k]); ;
			
		}


	}

}
