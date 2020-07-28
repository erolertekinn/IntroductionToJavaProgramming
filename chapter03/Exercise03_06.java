package chapter03;

import java.util.Scanner;

public class Exercise03_06 {

	public static void main(String[] args) {
		double pounds, feet,feetToMeter,inchesToMeter,kilograms,inches,bmi,totalMeter;
		Scanner keyboard = new Scanner(System.in);
		
	
		System.out.print("Enter weight in pounds :");
		pounds = keyboard.nextDouble();
		kilograms = pounds * 0.45359237;
		
		System.out.print("Enter feet :");
		feet = keyboard.nextDouble();
		feetToMeter = feet * 0.3048;
		
		System.out.print("Enter inches :");
		inches = keyboard.nextDouble();
		inchesToMeter = inches * 0.0254;
		
		totalMeter = feetToMeter + inchesToMeter;
		
		bmi = kilograms / Math.pow(totalMeter, 2);
		System.out.println("BMI is "+bmi);
		
		if(bmi<18.5) {
			System.out.println("Underweight");
		}
		else if(bmi <25) {
			System.out.println("Normal");
		}
		else if(bmi<30) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
	}

}
