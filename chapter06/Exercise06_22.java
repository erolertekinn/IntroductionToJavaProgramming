package chapter06;

import java.util.Scanner;

public class Exercise06_22 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number : ");
		long n = keyboard.nextLong();
		System.out.printf("Square root of number : %-9.2f" , sqrt(n));
	}

	public static double sqrt(long n) {
		final double EPSILON = 0.0001;
		double lastGuess = 1.0;
		double nextGuess;
		while (true) {
			nextGuess = (lastGuess + n / lastGuess) / 2;
			if (Math.abs(nextGuess - lastGuess) < EPSILON) {
				return nextGuess;
			} else {
				lastGuess = nextGuess;
			}
		}
	}

}
