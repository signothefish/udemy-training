package com.danaedwards;

public class Main
{

	public static void main(String[] args)
	{
		String numberAsString = "1000";
		System.out.println("Number as string is " + numberAsString);
		int number = Integer.parseInt(numberAsString);
		System.out.println("Number as int is " + number);
		numberAsString += 1;
		number += 1;
		System.out.println("Number as string is " + numberAsString);
		System.out.println("Number as int is " + number);

		double numberAsDouble = Double.parseDouble(numberAsString);
		System.out.println("Number as double is " + numberAsDouble);
	}

}
