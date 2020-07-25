package chapter02;

import java.util.Scanner;

public class Exercise02_11 {
	public static void main(String[] args) {
		
		int currentPopulation,oneyearChange,totalChange;
		int year,futPopulation;
		Scanner keyboard = new Scanner(System.in);
		
		currentPopulation = 312032489;
		
		oneyearChange = ((365*24*60*60)/7) - ((365*24*60*60)/13) + ((365*24*60*60)/45);
		
		System.out.print("Enter the number of years: ");
		year = keyboard.nextInt();
		
		totalChange = year * oneyearChange;
		futPopulation = (totalChange + currentPopulation);
		System.out.println("The population in 5 years is "+futPopulation);
	}

}
