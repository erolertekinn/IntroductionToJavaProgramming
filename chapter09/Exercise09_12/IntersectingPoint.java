package chapter09.Exercise09_12;

import java.util.Scanner;

import chapter09.Exercise09_11.LinearEquation;

public class IntersectingPoint {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = keyboard.nextDouble();
		double y1 = keyboard.nextDouble();
		double x2 = keyboard.nextDouble();
		double y2 = keyboard.nextDouble();
		double x3 = keyboard.nextDouble();
		double y3 = keyboard.nextDouble();
		double x4 = keyboard.nextDouble();
		double y4 = keyboard.nextDouble();

		double a = y1 - y2;
		double b = x2 - x1;
		double c = y3 - y4;
		double d = x4 - x3;
		double e = (y1 - y2) * x1 - y1 * (x1 - x2);
		double f = x3 * (y3 - y4) - y3 * (x3 - x4);

		LinearEquation linEq1 = new LinearEquation(a, b, c, d, e, f);
		if (linEq1.isSolvable()) {
			System.out.println("The intersecting point is at ( " + linEq1.getX() + " , " +linEq1.getY() + " )");
		} else {
			System.out.println("The two lines are parallel.");
		}

	}
}