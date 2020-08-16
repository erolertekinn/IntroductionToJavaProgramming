package chapter05;

import java.util.Scanner;

public class Exercise05_36 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String stringISBN = keyboard.nextLine();

		int d10 = 0;

		// int d10 = (d1 * 1 + d2 * 2 + d3 *3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 *
		// 8 + d9 * 9) % 11;
		for (int i = 0; i < 9; i++) {
			char tempCharISBN = stringISBN.charAt(i);
			int intISBN = Character.getNumericValue(tempCharISBN);
			d10 = d10 + (intISBN * (i + 1));

		}
		d10 = d10 % 11;

		for (int i = 0; i < 9; i++) {
			System.out.print(stringISBN.charAt(i));
		}
		if (d10 == 10)
			System.out.println("X");
		else
			System.out.println(d10);
	}
}