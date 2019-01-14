package com.danaedwards;

public class Main
{

	public static void main(String[] args)
	{
		int myIntValue = 5 / 2;
		// Width of float = 32 (4 bytes)
		float myFloatValue = 5f / 3f; // Enter an 'f' after the number to indicate that it's a float
		// Width of double = 64 (8 bytes)
		double myDoubleValue = 5d / 3d; // Enter a 'd' after the number to indicate that it's a double
		float myNewFloatValue = (float) 5.4; // Can also cast
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("myFloatValue = " + myFloatValue);
		System.out.println("myDoubleValue = " + myDoubleValue);
		double pi = 3.141_592_7d;
	}

}
