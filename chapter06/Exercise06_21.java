package chapter06;

import java.util.Scanner;

public class Exercise06_21 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a letter : ");
		String str = keyboard.nextLine();

		//char chr = str.charAt(0);
		//chr = Character.toUpperCase(chr);
		//System.out.print("The corresponding number is " + getNumber(chr));
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetterOrDigit(str.charAt(i)))
				System.out.print(getNumber(Character.toUpperCase(str.charAt(i))));
			else
				System.out.print("");
		}
		System.out.println();
	}

	static int getNumber(char chr) {
		int chrInt = (int) chr;
		int result = 0;
		if ((chr >= 87 && chr <= 90) || chr == 57)
			result = 9;
		else if ((chr >= 84 && chr < 87)|| chr == 56)
			result = 8;
		else if ((chr >= 80 && chr < 84)|| chr == 55)
			result = 7;
		else if ((chr >= 77 && chr < 80)|| chr == 54)
			result = 6;
		else if ((chr >= 74 && chr < 77)|| chr == 53)
			result = 5;
		else if ((chr >= 71 && chr < 74)|| chr == 52)
			result = 4;
		else if ((chr >= 68 && chr < 71)|| chr == 51)
			result = 3;
		else if ((chr >= 65 && chr < 68)|| chr == 50)
			result = 2;
		else if (chr == 49)
			result = 1;
		else if (chr == 48)
			result = 0;
	

		return result;

	}

}
