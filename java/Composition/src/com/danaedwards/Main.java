package com.danaedwards;

public class Main
{

	public static void main(String[] args)
	{
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("c3po", "dell", "240", dimensions);
		Monitor theMonitor = new Monitor("27 inch beast", "Acer", 27, new Resolution(1440, 2540));
		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		// This can be done if the getters are public, but we will make them private
//		thePC.getMonitor().drawPixelAt(30, 60, "red");
//		thePC.getMotherboard().loadProgram("Microsoft v1.0");
//		thePC.getTheCase().pressPowerButton();
		thePC.powerUp();
	}

}
