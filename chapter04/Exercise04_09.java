package chapter04;

import java.util.Scanner;

public class Exercise04_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a character
		System.out.print("Enter a character: ");
		char ch = input.next().charAt(0);
		int iCh = (int)ch;

		// Display Unicode of character
		System.out.println(iCh);
	}
}
