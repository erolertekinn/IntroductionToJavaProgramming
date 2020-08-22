package chapter06;

import java.util.Scanner;

public class Exercise06_01 {
	public static void main(String[] args) {
		int counter = 1;
		while (counter <= 100) {

			System.out.printf("%8d", getPentagonalNumber(counter));
			if (counter % 10 == 0) {
				System.out.println();
			}
			counter++;
		}

	}

	public static int getPentagonalNumber(int n) {

		int rValue = n * (3 * n - 1) / 2;

		return rValue;

	}

}
