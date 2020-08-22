package chapter06;

import java.util.Scanner;

public class Exercise06_07 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("The amount invested : ");
		double investmentAmount = keyboard.nextDouble();
		System.out.print("Annual interest rate : ");
		double annualInterestRatePer = keyboard.nextDouble();
		System.out.print("Enter number of years : ");
		int years = keyboard.nextInt();

		double monthlyInterestRate = annualInterestRatePer / (12 * 100);

		System.out.printf("%5S %8S %12S\n", "Years", " ", "Future Value");
		for (int i = 1; i <= years; i++) {
			System.out.printf("%-5d %8S %12.2f\n",i," ", futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
		}

		futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {

		return investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));

	}

}
