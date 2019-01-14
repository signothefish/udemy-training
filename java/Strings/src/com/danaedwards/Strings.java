package com.danaedwards;


public class Strings
{

	public static void main(String[] args)
	{
		String myString = "This is a string"; // Strings use double-quotes, strings are not primitive types
		System.out.println("myString is equal to " + myString);
		myString = myString + ", and this is more";
		System.out.println("myString is equal to " + myString);

		String lastString = "250.55";
		int myInt = 50;
		lastString = lastString + myInt;
		System.out.println("lastString is equal to " + lastString);
	}

}
