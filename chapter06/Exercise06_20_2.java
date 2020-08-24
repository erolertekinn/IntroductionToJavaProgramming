package chapter06;

import java.util.Scanner;

public class Exercise06_20_2 {


	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a String : ");
		String str = keyboard.nextLine();

		System.out.print("Number of the letter : " + countLetters(str));

	}

	public static int countLetters(String str) {
		int counter = 0;
		String input = str.toLowerCase();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int value = (int) ch;
			if (value >= 97 && value <= 122) {
				counter++;
			}

		}
		return counter;
	}
}
