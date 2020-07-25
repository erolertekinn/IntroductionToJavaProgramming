package chapter02;

import java.util.Scanner;

public class Exercise02_05 {

	public static void main(String[] args) {
		
		double subTotal,gratuityRate,gratuityResult,total;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and gratuity rate:");
		subTotal = keyboard.nextDouble();
		gratuityRate = keyboard.nextDouble();
		
		gratuityResult = subTotal * (gratuityRate/100);
		total = gratuityResult + subTotal;
		
		System.out.println("The gratuity is $"+ gratuityResult+" and total is $"+total);
		

	}

}
