package chapter03;

import java.util.Scanner;

public class Exercise03_25 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("First point of Line 1 are (x1, y1) : ");
		double x1 = keyboard.nextDouble();
		double y1 = keyboard.nextDouble();
		System.out.print("Second point of Line 1 are (x2, y2) : ");
		double x2 = keyboard.nextDouble();
		double y2 = keyboard.nextDouble();
		System.out.print("First point of Line 2 are (x3, y3) : ");
		double x3 = keyboard.nextDouble();
		double y3 = keyboard.nextDouble();
		System.out.print("Second point of Line 2 are (x4, y4) : ");
		double x4 = keyboard.nextDouble();
		double y4 = keyboard.nextDouble();

		// ax + by = e
		// cx + dy = f
		double a = y1 - y2;
		double b = x1 - x2;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;

		double c = y3 - y4;
		double d = x3 - x4;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		double control = a * d - b * c;
		double x = (int)(((e * d - b * f) / (a * d - b * c)) * 100000) / 100000.0;
		double y = (int)(((a * f - e * c) / (a * d - b * c)) * 100000) / 100000.0;

		if (control == 0) {
			System.out.println("The two lines are parallel.");
		} else {
			System.out.println("The intersecting point is at ( " + x + " , " + y + " )");
		}
	}
}
