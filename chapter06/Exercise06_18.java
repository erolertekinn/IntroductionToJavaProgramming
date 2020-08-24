package chapter06;

import java.util.Scanner;

public class Exercise06_18 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Password : ");
		String password = keyboard.nextLine();
		
		boolean validation = (passwordCheckNumberOfCharacters(password) && passwordCheckNumberOfDigits(password) && passwordCheckLettersDigits(password));
		System.out.print(validation ? "Valid Password" : "Invalid Password");
	}

	public static boolean passwordCheckLettersDigits(String password) {
		boolean result1 = true;
		for (int i = 0; i <= password.length() - 1; i++) {
			int charValue = password.charAt(i);
			boolean control = (97 <= charValue && charValue <= 122) || (65 <= charValue && charValue <= 90)
					|| (48 <= charValue && charValue <= 57);
			result1 = result1 && control;
		}
		return result1;
	}

	public static boolean passwordCheckNumberOfDigits(String password) {
		boolean result2 = false;
		int numberOfDigits = 0;
		for (int i = 0; i <= password.length() - 1; i++) {
			int charValue = password.charAt(i);
			if ((48 <= charValue && charValue <= 57)) {
				numberOfDigits++;
			}
			if (numberOfDigits >= 2) {
				result2 = true;
			}
		}
		return result2;
	}
	public static boolean passwordCheckNumberOfCharacters(String password) {
		boolean result3 = true;
		if(password.length()<8) {
			result3 = false;
		}
		return result3;
	}
	
	
}
