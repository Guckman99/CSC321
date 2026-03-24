// Eduardo Guzman


#include<stdlib.h>
#include<stdio.h>
#include<time.h>

int main(void)
{

	srand(time(NULL));

	int answer = 1 + rand() % 20;
	int guess = 0;

	while (guess < 1 || guess > 20)
	{
		printf("Guess a number between 1 and 20:\n ");
		scanf("%d" , &guess);

		if (guess < 1 || guess > 20)
		{
			printf("Invalid! Please try a number between 1 and 20! \n");
		}
	}

	if (guess == answer)
	{
		for (int i = 0; i < guess; i++)
		{
			printf("NOICE!\n");
		}
	}
	else
	{
		printf("Better luck next time bud... The number was %d. \n", answer);

		if (guess < answer)
		{
			printf("Too low\n");
		}
		else
		{
			printf("Too high\n");
		}
	}


	return EXIT_SUCCESS;
}
