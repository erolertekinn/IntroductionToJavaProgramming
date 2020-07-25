package chapter02;

import java.util.Scanner;

public class Exercise02_21 {

	public static void main(String[] args) {
		double investmentAmount, annualInterestRatePer, years, futureInvestmentValue,monthlyInterestRate;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter investment amount : ");
		investmentAmount = keyboard.nextDouble();
		System.out.print("Enter annual interest rate in percentage : ");
		annualInterestRatePer = keyboard.nextDouble();
		System.out.print("Enter number of years : ");
		years = keyboard.nextDouble();
		
		monthlyInterestRate = annualInterestRatePer / (12*100);
		futureInvestmentValue = investmentAmount * Math.pow((1+monthlyInterestRate), (years*12));
		System.out.print("Accumulated value is $"+futureInvestmentValue);
	
	}

}
