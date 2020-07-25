package chapter02;

import java.util.Scanner;

public class Exercise02_01 {

	public static void main(String[] args) {
		
		double number,celsius,fahrenheit;
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("Please enter the heat of the room as Celsius = ");
		celsius = keyboard.nextDouble();
		fahrenheit = (9 / 5) * celsius + 32;
		
		System.out.println("The heat of the room as Celcius is = "+celsius);
		System.out.println("The heat of the room as Fahrenheit is = "+fahrenheit);
		
	}

}
