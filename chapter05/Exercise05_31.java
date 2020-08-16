package chapter05;

import java.util.Scanner;

public class Exercise05_31 {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Enter the initial deposit amount : ");
	double initialDepositAmount = keyboard.nextDouble();
	
	System.out.print("Enter annual percentage yield : ");
	double annualPercentageYield = keyboard.nextDouble();
	
	System.out.print("Enter maturity period (number of months) :");
	double maturityPeriod = keyboard.nextDouble();
	
	double monthlyInterestRate = annualPercentageYield / 1200;
	
	System.out.println("Months\tCD Value");
	for (int i = 1; i <= maturityPeriod; i++) {
		initialDepositAmount = (initialDepositAmount) * (1 + monthlyInterestRate);
		System.out.println(i+"\t"+(int)(initialDepositAmount*100)/100.0);
	}
	
	
}
}