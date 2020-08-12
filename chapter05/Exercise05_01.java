package chapter05;

import java.util.Scanner;

public class Exercise05_01 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int poz = 0;
		int neg = 0;
		int counter = 0;
		double top = 0;

		System.out.print("Enter  an integer, the input ends if it is 0: ");
		int sayi1 = keyboard.nextInt();

		if (sayi1 == 0) {
			System.out.println("No numbers are entered except 0");
		}

		else {
			while (sayi1 != 0) {

				top += sayi1;
				if (sayi1 > 0) {
					poz++;
				} else {
					neg++;

				}
				counter++;
				sayi1 = keyboard.nextInt();

			}

		}

		double average = top / counter;
		System.out.println("The number of positives is " + poz);
		System.out.println("The number of negatives is " + neg);
		System.out.println("The total is " + top);
		System.out.println("The average is " + average);
	}

}
