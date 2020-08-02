package chapter03;

import java.util.Scanner;

public class Exercise03_29 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); // Create a new Scanner

		
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1 = keyboard.nextDouble();
		double y1 = keyboard.nextDouble();
		double r1 = keyboard.nextDouble();
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2 = keyboard.nextDouble();
		double y2 = keyboard.nextDouble();
		double r2 = keyboard.nextDouble();

		if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= Math.abs(r1 - r2)) {
			System.out.println("circle2 is inside circle1");
		}

		else if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= r1 + r2) {
			System.out.println("circle2 overlaps circle1");
		}

		else {
			System.out.println("circle2 does not overlap circle1");
		}

	}

}
