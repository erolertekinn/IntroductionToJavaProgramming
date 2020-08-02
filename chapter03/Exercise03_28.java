package chapter03;

import java.util.Scanner;

public class Exercise03_28 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter r1's center x-, y-coordinates, width and height: ");
		double r1x = keyboard.nextDouble();
		double r1y = keyboard.nextDouble();
		double r1Width = keyboard.nextDouble();
		double r1Height = keyboard.nextDouble();
		System.out.print("Enter r2's center x-, y-coordinates, width and height: ");
		double r2x = keyboard.nextDouble();
		double r2y = keyboard.nextDouble();
		double r2Width = keyboard.nextDouble();
		double r2Height = keyboard.nextDouble();

		if ((Math.pow(Math.pow(r2y - r1y, 2), .05) + r2Height / 2 <= r1Height / 2)
				&& (Math.pow(Math.pow(r2x - r1x, 2), .05) + r2Width / 2 <= r1Width / 2)
				&& (r1Height / 2 + r2Height / 2 <= r1Height) && (r1Width / 2 + r2Width / 2 <= r1Width))
			System.out.println("r2 is inside r1");
		
		
		else if ((r1x + r1Width / 2 > r2x - r2Width) || (r1y + r1Height / 2 > r2y - r2Height))
			System.out.println("r2 overlaps r1");
		
		
		else
			System.out.println("r2 does not overlap r1");
	}

}
