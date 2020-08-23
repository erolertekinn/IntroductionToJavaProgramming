package chapter06;

import java.util.Scanner;

public class Exercise06_12 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Char1 : ");
		char ch1 = keyboard.next().charAt(0);

		System.out.print("Char2 : ");
		char ch2 = keyboard.next().charAt(0);

		System.out.print("Number of the Characters per Line : ");
		int numberPerLine = keyboard.nextInt();

		printChars(ch1, ch2, numberPerLine);

	}

	public static void printChars(char ch1, char ch2, int numberPerLine) {
		int ch1Int = ch1;
		int ch2Int = ch2;
		int a = ch1Int;
		int counter = 1;
		;
		if (ch1Int < ch2Int)
			a = ch1Int;
		if (ch2Int < ch1Int)
			a = ch2Int;
		for (int i = a; i <= a + Math.abs(ch2Int - ch1Int); i++) {
			System.out.print((char) i+"\t");
			
			if(counter % numberPerLine==0)
				System.out.println();
			counter++;
		}
		

	}
}
