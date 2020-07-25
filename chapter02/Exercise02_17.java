package chapter02;

import java.util.Scanner;

public class Exercise02_17 {

	public static void main(String[] args) {
		double temp,windSpeed,windChillTemp;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		temp = keyboard.nextDouble();
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		windSpeed = keyboard.nextDouble();
		if(windSpeed >= 2) {
			windChillTemp = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temp * Math.pow(windSpeed, 0.16));
			System.out.println("The wind chill index is "+windChillTemp);
		}
		else {
			System.out.println("The wind speed is too low");
		}
		

	}

}
