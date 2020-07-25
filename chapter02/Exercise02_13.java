package chapter02;

import java.util.Scanner;

public class Exercise02_13 {

	public static void main(String[] args) {
		
		double monthlyInvest=0,accountValue=0;
		Scanner klavye = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount :");
		monthlyInvest = klavye.nextDouble();
		
		for(int i =0; i<6; i++) {
		accountValue = (accountValue + monthlyInvest) * (1+ 0.00417);
		
		}
		System.out.println("After the sixth month, the account value is $"+accountValue);

	}

}
