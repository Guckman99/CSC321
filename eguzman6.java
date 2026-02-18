//Eduardo Guzman
/*
 *
 * csc321
 * Lab 6
 */

import java.util.Scanner;

public class eguzman6
{
        public static void main(String[] args)
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

	System.out.println("int total" + total1);
	System.out.println("int total" + total2);
	System.out.println("int total" + total3);
	System.out.println("double total" + dtotal1);
	System.out.println("double total" + dtotal2);
	System.out.println("double total" + dtotal3);
	}	
}

