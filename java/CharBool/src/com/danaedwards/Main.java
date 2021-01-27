package com.danaedwards;

public class Main
{

	public static void main(String[] args)
	{
		// Width of 16 (2 bytes)
		char myChar = '&'; // Support unicode characters, use single-quotes
		char myUnicodeChar = '\u0026';
		System.out.println("Char is " + myChar + ", Unicode character was: " + myUnicodeChar);
		
		// Width of ... ?
		boolean myBoolean = false;
		boolean isMale = true;
	}

}
