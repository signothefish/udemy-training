package com.danaedwards;

public class Main
{

	public static void main(String[] args)
	{
		Animal animal = new Animal("animal", 1, 1, 5, 5);
		Dog dog = new Dog("Yorkie", 8, 20, 2, 40, 1, 20, 0, 0, "long silky");
		dog.eat();
		dog.walk();
		dog.run();
	}

}
