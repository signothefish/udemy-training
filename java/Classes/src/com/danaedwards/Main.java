package com.danaedwards;

public class Main
{

	public static void main(String[] args)
	{
		Car porsche = new Car();
		Car ford = new Car();
		Car defaultCar = new Car();
		System.out.println("Model of default car is " + defaultCar.getModel());
		porsche.setModel("carerra");
		System.out.println("Model of car is " + porsche.getModel());
		
		Car chevy = new Car(2, 4, "camaro", "8 cylinder", "red");
		System.out.println("Model of car is " + chevy.getModel());

	}

}
