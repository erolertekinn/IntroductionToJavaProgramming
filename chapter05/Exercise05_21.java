package chapter05;

import java.util.Scanner;

public class Exercise05_21 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Loan Amount: ");
		double loanAmount = keyboard.nextDouble();
		System.out.print("Number of Years : ");
		int numberOfYears = keyboard.nextInt();
		
		
		
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		
		for (double annualInterestRate = 5.0; annualInterestRate <= 8; annualInterestRate += 0.125) {
			double monthlyInterestRate = annualInterestRate / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			double totalPayment = monthlyPayment * numberOfYears * 12;
			System.out.printf("%-5.3f %17.2f %20.2f\n",annualInterestRate,monthlyPayment,totalPayment);
		}
	}
}
