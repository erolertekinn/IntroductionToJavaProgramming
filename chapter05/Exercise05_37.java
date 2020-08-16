package chapter05;

import java.util.Scanner;

public class Exercise05_37 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an Decimal Value = ");
		int number = keyboard.nextInt();
		// 35 / 2 = 17, Kalan = 1 17 / 2 = 8, Kalan = 1 8 / 2 = 4, Kalan = 0 4 / 2 = 2,
		// Kalan = 0 2 / 2 = 1, Kalan = 0 1 / 2 = 0, Kalan = 1
		int numberTemp= number;
		String stringBinary = "";
		while (number > 0) {
			int rest = number % 2;
			number = number / 2;
			stringBinary = rest + stringBinary;

		}
		System.out.println("Binary Equation of "+numberTemp+" is "+stringBinary);


	}

}
