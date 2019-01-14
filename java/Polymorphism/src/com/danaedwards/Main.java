package com.danaedwards;

class Movie {
	
	private String name;

	public Movie(String name)
	{
		this.name = name;
	}
	
	public String plot() {
		return "No plot here";
	}

	public String getName()
	{
		return name;
	}
	
	
	
}
class Jaws extends Movie {
	public Jaws() {
		super("Jaws");
	}
	// This is an override:
	public String plot() {
		return "Shark eats people";
	}
}
class IndependenceDay extends Movie {
	public IndependenceDay() {
		super("Independence Day");
	}
	// This is an override:
	public String plot() {
		return "Alien inasion";
	}
}
class MazeRunner extends Movie {
	public MazeRunner() {
		super("Maze Runner");
	}
	// This is an override:
	public String plot() {
		return "People run through a maze";
	}
}
class StarWars extends Movie {
	public StarWars() {
		super("Star Wars");
	}
	// This is an override:
	public String plot() {
		return "Space movie";
	}
}
class Forgettable extends Movie {
	// No override in this class
	public Forgettable() {
		super("Forgettable");
	}
}

// *********************************************************

public class Main
{

	public static void main(String[] args)
	{
		for (int i=1; i<11; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie #" + i + ": " + movie.getName() + " Plot: " + movie.plot() + "\n");
		}
	}
	
	public static Movie randomMovie() {
		int randomNumber = (int)(Math.random() * 5) + 1;
		System.out.println("Random number: " + randomNumber);
		switch(randomNumber) {
			case 1:
				return new Jaws();
			case 2:
				return new IndependenceDay();
			case 3:
				return new MazeRunner();
			case 4:
				return new StarWars();
			case 5:
				return new Forgettable();
		}
		return null;
	}

}
