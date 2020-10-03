package chapter09.Exercise09_10;

import java.util.Scanner;

public class TestQuadraticEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a: ");
		double a = input.nextDouble();
		System.out.print("Enter b: ");
		double b = input.nextDouble();
		System.out.print("Enter c: ");
		double c = input.nextDouble();

		QuadraticEquation q1 = new QuadraticEquation(a, b, c);

		if (q1.getDiscriminant() > 0) {
			System.out.println("Root1 " + q1.getRoot1());
			System.out.println("Root2 " + q1.getRoot2());
		}

		else if (q1.getDiscriminant() == 0) {
			System.out.println("Root1 " + q1.getRoot1());
		}

		else {
			System.out.println("The equation has no roots.");
		}
	}
}