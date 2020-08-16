package chapter05;

import java.util.Scanner;

public class Exercise05_41 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter  several numbers: ");
		int maxValue = input.nextInt();
		//System.out.print(maxValue);
		
		int counter = 1;
		int secondNumber = -1;
		while (secondNumber != 0) {
			secondNumber = input.nextInt();
			//System.out.print("\t"+secondNumber);
			if (secondNumber > maxValue) {
				maxValue = secondNumber;
			} else if (secondNumber == maxValue) {
				counter++;

			}
		}
		System.out.println("Largest of the numbers is "+maxValue);
		System.out.println("Occurence is "+counter);
	}
}
