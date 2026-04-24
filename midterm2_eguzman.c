//Eduardo Guzman
//CSC321 Midterm 2

#include <stdio.h>

void printFirstname(int num) // Function #1
{
	for (int i = 0; i < 7; i++)
	{
		printf("Eduardo %d\n", num);
	}
}

int main() // Function #2
{
	int number;
	printf("Enter a number to go with first name: ");
	scanf("%d", &number);
	printFirstname(number);
	
	
	return 0;
}
