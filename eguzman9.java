//Eduardo Guzman


import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Random random = new Random();
		int answer = 1 + random.nextInt(20);
		int guess = 0;
		Scanner scanner = new Scanner(System.in);

		while (guess < 1 || guess > 20)
		{
			System.out.println("Guess a random number between 1 - 20:");
			guess = scanner.nextInt();
			if (guess < 1 || guess > 20)
			{
				System.out.println("NOT IT CHEIF! Try another number between 1 - 20!");
			}
		}
		
		if (guess == answer)
		{
			for (int i = 0; i < guess; i++)
			{
			System.out.println("NOICE!");
		}
	}
	
	else
	{
		System.out.println("Better luck next time pal... The number was : " + answer);
		if (guess < answer)
		{
			System.out.println("Too low");
		}
		else
		{
			System.out.println("Too high");
		}
	}

	scanner.close();
	}
}

