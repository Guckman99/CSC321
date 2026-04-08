// Eduardo Guzman


#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

double calculateHyp (double base, double height)
{
	return sqrt((base * base) + (height * height));
}
int main()
{
	double base, height, hypotenuse;

	printf("Enter the base of the triangle: ");
	scanf("%lf", &base);

	printf("Enter the height of the triangle: ");
	scanf("%lf", &height);

	hypotenuse = calculateHyp(base, height);

	printf("\n The hypotenuse of the triangle is: %.2f\n", hypotenuse);
	
	return 0;
}
