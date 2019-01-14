package com.danaedwards;

public class Main
{

	public static void main(String[] args)
	{
		Player player = new Player();
		player.name = "Dana";
		player.health = 10;
		player.weapon = "knife";
		
		player.loseHealth(5);
		System.out.println("Health remaining: " + player.healthRemaining());

	}

}
