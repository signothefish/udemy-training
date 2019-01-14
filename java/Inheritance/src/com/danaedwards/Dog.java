package com.danaedwards;

public class Dog extends Animal
{
	// Characteristics related to a dog
	private int eyes;
	private int teeth;
	private int tail;
	private int legs;
	private String coat;

	// Generate parent constructor here, then add local fields
	public Dog(String name, int brain, int body, int size, int weight,
			   int eyes, int teeth, int tail, int legs, String coat)
	{
		super(name, 1, 1, size, weight); // "super" means Call the constructor from the class we are extending from
		this.eyes = eyes;
		this.teeth = teeth;
		this.tail = tail;
		this.legs = legs;
		this.coat = coat;
	}
	
	private void chew() {
		System.out.println("Dog.chew() called");
	}

	@Override
	public void eat()
	{
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog.walk() called");
		move(5);
	}

	public void run() {
		System.out.println("Dog.run() called");
		move(10);
	}

	public void moveLegs() {
		System.out.println("Dog.moveLegs() called");
	}
	
	@Override
	public void move(int speed) {
	 System.out.println("Dog.move() called");
	 System.out.println("Dog is moving at " + speed + "mph");
	 moveLegs();
	 super.move(speed);
	}
	

}
