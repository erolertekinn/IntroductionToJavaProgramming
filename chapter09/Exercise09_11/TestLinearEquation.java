package chapter09.Exercise09_11;

import java.util.Scanner;

public class TestLinearEquation {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a : ");
		double a = keyboard.nextDouble();
		System.out.print("Enter b : ");
		double b = keyboard.nextDouble();
		System.out.print("Enter c : ");
		double c = keyboard.nextDouble();
		System.out.print("Enter d : ");
		double d = keyboard.nextDouble();
		System.out.print("Enter e : ");
		double e = keyboard.nextDouble();
		System.out.print("Enter f : ");
		double f = keyboard.nextDouble();

		LinearEquation linEq1 = new LinearEquation(a, b, c, d, e, f);

		if (!linEq1.isSolvable()) {
			System.out.println("The equation has no solution");
		} 
		else {
			System.out.println("X is: " + linEq1.getX());
			System.out.println("Y is: " + linEq1.getY());
		}
	}
}