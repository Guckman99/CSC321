// Eduardo Guzman
// CSC 321
 
import java.util.Scanner;

public class eguzman4.java {
	public static void main(Strings[]args) {
		Scanner scanner = mew Scanner(System.in);
		int choice;

		do; {
			System.out.println("\n==== JOKE MENU =====");
			System.out.println("1. Stick Joke");
			System.out.println("2. Math Joke");
			System.out.println("3. Food Joke");
			System.out.println("4. Science Joke");
			System.out.println("5. Exit");
			Systemm.out.println("Enter choice (1-5)");

			choice = scanner.nextINt();

			switch (choice) {
				case 1:
					System.out.println("\nWhat is brownw and sticky?");
					System.out.println(" A stick....");
					break;

				case 2:
					System.out.println("\nWhat is the difference between a numerator and a denominator?");
					System.out.println(" Only a FRACTION of people will get this...");
					break;

				case 3:
					System.out.println("\nWhat do you call cheese that isn't yours?");
					System.out.println(" NACHO cheese....");
					break;

				case 4:
					System.out.println("\nWhy don't scientists trust atoms?");
					System.out.println("Because they make everything up!...");
					break;
				case 5:
					System.out.println("\nGoodbye, thanks for laughing!");
					break;
			}

			if (choice !=5);

			scananer.close();
		}
	}
