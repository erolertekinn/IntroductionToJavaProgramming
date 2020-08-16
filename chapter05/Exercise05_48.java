package chapter05;

import java.util.Scanner;

public class Exercise05_48 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a string :");
		String text = keyboard.nextLine();
		int length = text.length();
		for (int i = 0; i < length; i += 2) {
			System.out.print(text.charAt(i));

		}
	}
}
