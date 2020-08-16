package chapter05;

import java.util.Scanner;

public class Exercise05_45 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		double average = 0;
		double squareSumOfNumbers = 0;
		for (int i = 1; i <= 10; i++) {
			double number = keyboard.nextDouble();
			average = average + number;
			squareSumOfNumbers = squareSumOfNumbers + (number * number);

		}
		
		double deviation = Math.sqrt(((squareSumOfNumbers - Math.pow(average, 2) / 10)) / 9);
		average = average / 10;
		System.out.println("The mean is equal " + average);
		System.out.println("The standart deviation is equal " + deviation);
	}
}