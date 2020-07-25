package chapter02;

import java.util.Scanner;

public class Exercise02_14 {

	public static void main(String[] args) {
		
		double weight,pounds,bmi,kilograms,meters,inches;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter weight in pounds : ");
		pounds = keyboard.nextDouble();
		System.out.print("Enter height in inches : ");
		inches = keyboard.nextDouble();
		meters = inches * 0.0254;
		kilograms = pounds * 0.45359237;
		bmi = kilograms / Math.pow(meters, 2);
		System.out.print("BMI is "+bmi);
		
	}

}
