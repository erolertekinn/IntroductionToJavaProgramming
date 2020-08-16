package chapter05;

import java.util.Scanner;

public class Exercise05_47 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// d3 =10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 +
		// 3d12)%10
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string :");
		String isbn_13 = keyboard.next();
		int length = isbn_13.length();

		int sum = 0;
		if(length==12) {
		for (int i = 0; i < length; i++) {
			if (i % 2 == 0) {
				char chr_Di = isbn_13.charAt(i);
				int num_Di = Character.getNumericValue(chr_Di);
				sum = sum + num_Di;

			} else {
				char chr_Di = isbn_13.charAt(i);
				int num_Di = Character.getNumericValue(chr_Di);
				sum = sum + (3 * num_Di);
			}

		}
		int d13 = 10 - sum % 10;
		if (d13 == 10) {
			d13 = 0;

		}
		System.out.println("ISBN-13 ="+isbn_13 + d13);

	}
		else {
			System.err.println(isbn_13+" is invalid input");
			System.exit(0);
			
		}
	}

}
