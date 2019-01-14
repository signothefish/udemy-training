package com.danaedwards;

public class Main
{

	public static void main(String[] args)
	{
		// Has a width of 32
		int myMinValue = -2_147_483_648; // To the right of '=' is called a literal
		int myMaxValue = 2_147_483_647;
		int myTotal = myMinValue / 2;
		System.out.println("myTotal = " + myTotal);

		// Has a width of 8
		byte myByteValue = -128;
		byte myNewByteValue = (byte) (myByteValue / 2); // In an expression (to the right of '='), Java converts byte to int, so we use typecasting
		System.out.println("myNewByteValue = " + myNewByteValue);
		
		// Has a width of 16
		short myShortValue = -32768;
		short myNewShortValue = (short) (myShortValue / 2);
		System.out.println("myNewShortValue = " + myNewShortValue);
		
		// Has a width of 64, max is 2^63
		long myLongValue = 9_223_372_036_854_775_807L; // Note the 'l' or 'L', indicating longint
	}

}
