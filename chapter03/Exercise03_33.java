package chapter03;

import java.util.Scanner;

public class Exercise03_33 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter weight and price for package 1: ");
		double weightOfPackage1 = keyboard.nextDouble();
		double priceOf1 = keyboard.nextDouble();

		System.out.print("Enter weight and price for package 2: ");
		double weightOfPackage2 = keyboard.nextDouble();
		double priceOf2 = keyboard.nextDouble();

		if (priceOf1 / weightOfPackage1 < priceOf2 / weightOfPackage2) {
			System.out.println("Package 1 has a better price.");
		}

		else if (priceOf1 / weightOfPackage1 > priceOf2 / weightOfPackage2) {
			System.out.println("Package 2 has a better price.");
		}

		else {
			System.out.println("Two packages have the same price.");
		}

	}

}
