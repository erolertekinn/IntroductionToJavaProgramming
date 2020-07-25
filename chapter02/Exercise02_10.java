package chapter02;

import java.util.Scanner;

public class Exercise02_10 {

	public static void main(String[] args) {
		
		double kilograms,iniTemperatur,finalTemperatur,neededEnergy;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		kilograms = keyboard.nextDouble();
		System.out.print("Enter the initial temperature: ");
		iniTemperatur = keyboard.nextDouble();
		System.out.print("Enter the final temperature:");
		finalTemperatur = keyboard.nextDouble();
		
		neededEnergy = kilograms * (finalTemperatur - iniTemperatur) * 4184;
		System.out.print("The energy needed is "+neededEnergy);
	}

}
