package chapter05;

import java.util.Scanner;

public class Exercise05_49 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a string :");
		String text = keyboard.nextLine();
		int length = text.length();
		text = text.toUpperCase();

		int vowels = 0;
		int constants = 0;
		for (int i = 0; i < length; i++) {
			char charAtIndex = text.charAt(i);
			if (charAtIndex == 'A' || charAtIndex == 'E' || charAtIndex == 'I' || charAtIndex == 'O'
					|| charAtIndex == 'U') {
				vowels++;

			} else {
				constants++;
			}

		}
		System.out.println("The number of vowels is " + vowels);
		System.out.println("The number of consonants is " + constants);
	}

}
