package chapter03;

import java.util.Scanner;

public class Exercise03_20 {

	public static void main(String[] args) {
		
		double temp,windSpeed,windChillTemp;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		temp = keyboard.nextDouble();
		
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		windSpeed = keyboard.nextDouble();
		
		if(windSpeed >= 2 && (temp <= 41 && temp >=-58)) {
			windChillTemp = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temp * Math.pow(windSpeed, 0.16));
			System.out.println("The wind chill index is "+windChillTemp);
		}
		else {
			if(!(temp <= 41 && temp >=-58) && !(windSpeed >= 2)){
				System.out.println("Temperature is not between -58°F and 41°F and Wind Speed is less than 2");
			}
			else if (!(temp <= 41 && temp >=-58)) {
				System.out.println("Temperature is not between -58°F and 41°F");	
			}
			else {
				System.out.println("Wind Speed is less than 2");
			}
		}
	}

}
