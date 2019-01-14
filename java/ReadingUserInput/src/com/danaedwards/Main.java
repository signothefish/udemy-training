package com.danaedwards;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner inputScanner = new Scanner(System.in);

		int yearOfBirth = 0;
		boolean hasNextInt = false;
		while(! hasNextInt || yearOfBirth <= 1900 || yearOfBirth >= 2020) { 
			System.out.println("Enter your year of birth: ");
			hasNextInt = inputScanner.hasNextInt(); // This finds out if the next item entered is an int
			if (hasNextInt)
				yearOfBirth = inputScanner.nextInt();
			inputScanner.nextLine(); // This is needed after entering a number due to the Enter key
		}
		System.out.println("Your year of birth is " + yearOfBirth);

		System.out.println("Enter your name: ");
		String name = inputScanner.nextLine();
		System.out.println("Your name is " + name);
		
		inputScanner.close();
	}

}
