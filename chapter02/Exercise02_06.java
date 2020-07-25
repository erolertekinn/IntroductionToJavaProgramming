package chapter02;

import java.util.Scanner;

public class Exercise02_06 {

	public static void main(String[] args) {
		
		int number, digitSum;
		int birler=0,onlar=0, yuzler=0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		number = keyboard.nextInt();
		
		if(number > 0 && number <1000) {
			birler = number % 10;
			onlar = (number % 100) / 10;
			yuzler = number / 100;
			digitSum = birler + onlar + yuzler;
			System.out.println("The sum of the digits is "+digitSum);
		}
		else {
			System.out.println("The number that you enter is not in the expected range. ");
		}
		
		

	}

}
