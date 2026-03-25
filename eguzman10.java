// Eduardo Guzman

import java.util.Scanner;

public class eguzman10
{
	static double volumeCalc ( double radius, double height)	
	{
		double volume = 3.14 * radius * radius * height;
		return volume;
	}

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter radius of Cylinder: ");
		double radius = scanner.nextDouble();

		System.out.println("Enter height of Cylinder: ");
		double height = scanner.nextDouble();

		double volume = volumeCalc(radius, height);

		System.out.printf("Volume of Cylinder: %.2f%n", volume);

		scanner.close();
	}
}



		
