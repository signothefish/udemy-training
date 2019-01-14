public class Main
{
	// This is actually a method: method main
	public static void main(String[] args)
	{
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		calculateScore(gameOver, score, levelCompleted, bonus);
		int finalScore = calculateAndReturnScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + finalScore);
	}
	
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if (gameOver)
		{
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore);
		}
	}
	
	public static int calculateAndReturnScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if (gameOver)
		{
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			return finalScore;
		}
		return -1; // Returning a -1 usually indicates an error in Java
	}


}
