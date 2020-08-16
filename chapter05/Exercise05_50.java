package chapter05;

import java.util.Scanner;
import java.util.stream.Collector.Characteristics;

public class Exercise05_50 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = keyboard.nextLine();

		int countUp = 0;
		int countDown = 0;
		int length = text.length();
		for (int i = 0; i < length;  i++) {
			boolean upperCaseControl = Character.isUpperCase(text.charAt(i));
			if (upperCaseControl)
				countUp++;
			else {
				countDown++;
			}
		}

		// Display the results
		System.out.println("Tne number of uppercase letters is " + countUp);
		System.out.println("Tne number of uppercase letters is " + countDown);
	}
}