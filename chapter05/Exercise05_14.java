package chapter05;

import java.util.Scanner;

public class Exercise05_14 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the first number:");
		int number1 = keyboard.nextInt();
		System.out.print("Enter the second number:");
		int number2 = keyboard.nextInt();

		int counter = 2;
	    int gcd = 1;
		while (counter <= number1 && counter <= number2) {
			if (number1 % counter == 0 && number2 % counter == 0) {
					gcd = counter;
			}
			counter++;

		}
		System.out.println("The greatest common divisor for " + number1 +" and " + number2 + " is " + gcd);
	}
}
