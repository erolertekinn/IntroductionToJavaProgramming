package chapter05;

import java.util.Scanner;

public class Exercise05_22 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Loan Amount : ");
		double loanAmount = keyboard.nextDouble();
		System.out.print("Number of Years : ");
		int numberOfYears = keyboard.nextInt();
		System.out.print("Annual Interest Rate : ");
		double annualInterestRate = keyboard.nextDouble();

		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;

		System.out.printf("Monthly Payment: %.2f\n",monthlyPayment);
		System.out.printf("Total Payment: %.2f\n",totalPayment);
		
		double balance = loanAmount;
		double principal, interest;
		int paymentNumber = numberOfYears * 12;


		System.out.println("Payment#     Interest     Principal     Balance");
		for (int i = 1; i <= paymentNumber; i++) {
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			
			System.out.printf("%-11d  %7.2f  %12.2f  %11.2f \n",i,interest,principal,balance);


		}

	}
}
