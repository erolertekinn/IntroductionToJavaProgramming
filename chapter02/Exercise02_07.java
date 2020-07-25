package chapter02;

import java.util.Scanner;

public class Exercise02_07 {

	public static void main(String[] args) {
		
		int minutes,years,remainDays,totalDays;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes :");
		minutes = keyboard.nextInt();
		totalDays = (minutes / 60 ) / 24;
		years = totalDays / 365;
		remainDays = totalDays % 365;
		
		
		System.out.println(minutes+" minutes is approximately "+years+" and "+remainDays);

	}

}
