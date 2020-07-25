package chapter02;

import java.util.Scanner;

public class Exercise02_20 {

	public static void main(String[] args) {
		double interest,balance,annualInterestRate;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		balance = keyboard.nextDouble();
		annualInterestRate = keyboard.nextDouble();
		interest = balance * (annualInterestRate / 1200);
		System.out.println("The interest is "+interest);

	}

}
