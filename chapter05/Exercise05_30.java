package chapter05;

import java.util.Scanner;

public class Exercise05_30 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Amount : ");
		double amount = keyboard.nextDouble();
		
		System.out.print("Annual interest rate : ");
		double annualInterestRate = keyboard.nextDouble();
		
		System.out.print("Number of the months : ");
		double numberOfTheMonths = keyboard.nextDouble();

		double monthlyInterestRate = annualInterestRate / 1200;
		double cumulativeMoney = 0;
		for (int i = 1; i <= numberOfTheMonths; i++) {
			cumulativeMoney = (amount+cumulativeMoney) * (1 + monthlyInterestRate);

		}
		System.out.println("Savings in the Account : "+(int)(cumulativeMoney*100)/100.0);
	}
}