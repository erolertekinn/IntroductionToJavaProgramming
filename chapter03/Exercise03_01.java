package chapter03;

import java.util.Scanner;

public class Exercise03_01 {

	public static void main(String[] args) {
		double discriminant,r1,r2,b,a,c;
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Calculating the two roots of a quadratic equation");
		System.out.println("ax^2 + bx +c = 0");
		System.out.println("Enter a, b, c values: ");
		
		a = keyboard.nextDouble();
		b = keyboard.nextDouble();
		c = keyboard.nextDouble();
		
		discriminant = Math.pow(b, 2) - 4 * a * c;
		
		r1 = (-b + Math.sqrt(discriminant)) / (2*a);
		
		r2 = (-b - Math.sqrt(discriminant)) / (2*a);
		
		
		
		if (discriminant > 0) {
			// This equation has two roots.
			System.out.println("The equation has two roots "+r1+" and "+r2);
		}
		else if (discriminant == 0) {
			System.out.println("The equation has one root "+r1);
		}
		else {
			System.out.println("The equation has no real roots");
		}

	}

}
