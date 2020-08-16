package chapter05;

import java.util.Scanner;

public class Exercise05_38 {
	public static void main(String[] args) {

			Scanner keyboard = new Scanner(System.in); 

			System.out.print("Enter a decimal integer: ");
			int decimal = keyboard.nextInt();
			int decimalTemp =decimal;
			String octal = "";							
		
			while(decimal>0) {
				octal = decimal % 8 + octal;
				decimal = decimal / 8;
			}


			System.out.println("The octal of " + decimalTemp + " is " + octal);
		}
	}