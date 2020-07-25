package chapter02;

import java.util.Scanner;

public class Exercise02_09 {

	public static void main(String[] args) {
		
		double v0,v1,t,averageAcceleration;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter v0, v1, and t: ");
		v0 = keyboard.nextDouble();
		v1 = keyboard.nextDouble();
		t = keyboard.nextDouble();
		
		averageAcceleration = (v1 - v0) / t;
		
		System.out.println("The average acceleration is "+averageAcceleration);

	}

}
