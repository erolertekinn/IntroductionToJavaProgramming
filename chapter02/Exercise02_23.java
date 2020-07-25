package chapter02;

import java.util.Scanner;

public class Exercise02_23 {

	public static void main(String[] args) {
		
		double milesPerGallon,pricePerGallon,distance,totalCost;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the driving distance :");
		distance = keyboard.nextDouble();
		System.out.print("Enter miles per gallon :");
		milesPerGallon = keyboard.nextDouble();
		System.out.print("Enter price per gallon :");
		pricePerGallon = keyboard.nextDouble();
		
		totalCost = (distance / milesPerGallon) * pricePerGallon;
		System.out.print("The cost of driving is $"+totalCost);

	}

}
