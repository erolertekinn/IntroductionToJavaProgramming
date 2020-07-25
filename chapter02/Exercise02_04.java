package chapter02;

import java.util.Scanner;

public class Exercise02_04 {

	public static void main(String[] args) {
		
		double kg, pounds;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number in pounds: ");
		pounds = keyboard.nextDouble();
		
		kg = pounds * 0.454;
		
		System.out.println(pounds+" pounds is "+kg+ " kilograms");

	}

}
