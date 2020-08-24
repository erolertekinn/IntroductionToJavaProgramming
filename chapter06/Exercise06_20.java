package chapter06;

import java.util.Scanner;

public class Exercise06_20 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String str = keyboard.nextLine();
		
		System.out.print("Number of the letter : "+countLetters(str));

	}

	public static int countLetters(String str) {

		int numberOfLetter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)))
				numberOfLetter++;
		}

		return numberOfLetter;
	}

}
