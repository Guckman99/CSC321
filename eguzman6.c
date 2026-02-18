//Eduardo Guzman
//Do the programs evaluate the same in both programming language? - Yes
//Why or why not? - They essentially run the order of operations in the same way, the only difference betweent he two is the format in which the output is coded`.
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	int x = 20;
	int y = 30;
	double c = 20;
	double v = 30;
	double total1 = 0;
	double total2 = 0;
	double total3 = 0;
	double dtotal1 = 0;
	double dtotal2 = 0;
	double dtotal3 = 0;

	total1 = x+y*x/y-x;
	total2 = -x-y/x*y+x;
	total3 = x+y-x/y;

	dtotal1 = x+y*x/y-x;
	dtotal2 = -x-y/x*y+x;
	dtotal3 = x+y-x/y;

	printf("int total1 = %lf \n", total1);
       	printf("int total2 = %lf \n", total2);
       	printf("int total3 = %lf \n", total3);
	printf("double total1 = %lf \n" ,total1);
       	printf("double total2 = %lf \n" ,total2);
       	printf("double total3 = %lf \n" ,total3);

	

	return EXIT_SUCCESS;
}


