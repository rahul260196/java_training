package com.string.all;

public class Lenth {

	public static void main(String[] args) {
		// TODO Auto-ge'nerated method stub
		String s= new String("Rama");
		String s1= new String("Rama");
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		
		String s2= "Rama";
		String s3="Rama";
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		
		String s4= "Rama";
		String s5="rama";
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		
		String s6= new String("Rama");
		String s7= new String("rama");
		System.out.println(s6.equals(s7));
		System.out.println(s6==s7);
		
		String s8 = "     my name is Rama     ";
		
		System.out.println(s8);
		System.out.println(s8.trim());
		
		
		String s9="Rama";
		char c[] = s9.toCharArray();
		String s10 = "Maharashtra";
		System.out.println(c.length);
		System.out.println(s10.substring(2));
		System.out.println(s10.substring(4,11));
		
		
		
		
		
		
		
        
	}

}
