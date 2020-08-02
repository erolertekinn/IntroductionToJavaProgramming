package chapter03;

import java.util.Scanner;

public class Exercise03_31 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = keyboard.nextDouble();

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int taskToDo = keyboard.nextInt();

		double amount;
		switch (taskToDo) {
		case 0:
			System.out.print("Enter the dollar amount: ");
			amount = keyboard.nextDouble();
			System.out.println("$" + amount + " is " + ((int) ((amount * 100) / exchangeRate)) + " yuan");
			break;

		case 1:
			System.out.print("Enter the RMB amount: ");
			amount = keyboard.nextDouble();
			System.out.println(amount + " yuan is $" + ((int) ((amount * 100) / exchangeRate)) / 100.0);
			break;

		default:
			System.out.println("Incorrect input");
		}

	}

}
