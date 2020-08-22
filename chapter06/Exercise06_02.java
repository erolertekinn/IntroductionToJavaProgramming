package chapter06;

import java.util.Scanner;

public class Exercise06_02 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a 3 digit number : ");
		long number = keyboard.nextLong();
		System.out.printf("Sum of the Digits is : %5d",sumDigits(number));
	}

	public static int sumDigits(long number) {

		int nbr = (int) number;
		//454
		int bb = nbr % 10;
		int ob = (nbr % 100) /10;
		int yb = nbr / 100;
		
		int sum = bb+ob+yb;
		
		return sum;
	}
}
