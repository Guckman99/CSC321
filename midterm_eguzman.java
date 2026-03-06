// Eduardo Guzman


import java.util.Scanner;

public class midterm_eguzman
{
	public static void  main(String[] args)
{
int secretNum = 19;
System.out.println("Guess a number between 10 and 20!");
Scanner scanner = new Scanner(System.in);
int guess = scanner.nextInt();

if (guess < secretNum)
{
	System.out.println("TOO COLD");
} else if (guess > secretNum)
{
	System.out.println("TOO HOT!");
} else
{
	System.out.println("NICE, GG!");
	scanner.close();
}
}
}

