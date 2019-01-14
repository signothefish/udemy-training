package com.danaedwards;

public class Car
{
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	// Empty Constructor with default values
	public Car() {
		// To ensure all fields get default values
		this(4, 4, "Ford", "6 cylinder", "white"); // This MUST be the first line in the default (empty) constructor
	}
	
	public Car(int doors, int wheels, String model)
	{
		this.doors = doors;
		this.wheels = wheels;
		this.model = model;
	}



	// Constructor with values
	public Car(int doors, int wheels, String model, String engine, String color) {
		this.doors = doors;
		this.wheels = wheels;
		this.model = model;
		this.engine = engine;
		this.color = color;
		// Don't call setters or any other methods in a constructor
	}
	
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if (validModel.equals("carerra") || validModel.equals("mustang"))
			this.model = model;
		else
			this.model = "Unknown";
	}
	public String getModel() {
		return this.model;
	}
}
