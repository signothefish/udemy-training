package com.danaedwards;

public class Main
{

	public static void main(String[] args)
	{
		// Width of 16 (2 bytes)
		char myChar = '&'; // Support unicode characters, use single-quotes
		char myNewChar = '\u00A9';
		System.out.println("Unicode character was: " + myNewChar);
		
		// Width of ... ?
		boolean myBoolean = false;
		boolean isMale = true;
	}

}
