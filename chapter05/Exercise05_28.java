package chapter05;

import java.util.Scanner;

public class Exercise05_28 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the year: ");
		int year = keyboard.nextInt();

		System.out.print("Enter the first day of the year 1-7: ");
		int firstDay = keyboard.nextInt();

		boolean leapTrue = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

		for (int month = 1; month <= 12; month++) {

			String output = "";
			switch (month) { // Concat Month to output
			case 1:
				output += ("January 1 " + year + " is");
				break;
			case 2:
				output += ("February 1 " + year + " is");
				break;
			case 3:
				output += ("March 1 " + year + " is");
				break;
			case 4:
				output += ("April 1 " + year + " is");
				break;
			case 5:
				output += ("May 1 " + year + " is");
				break;
			case 6:
				output += ("June 1 " + year + " is");
				break;
			case 7:
				output += ("July 1 " + year + " is");
				break;
			case 8:
				output += ("August 1 " + year + " is");
				break;
			case 9:
				output += ("September 1 " + year + " is");
				break;
			case 10:
				output += ("October 1 " + year + " is");
				break;
			case 11:
				output += ("November 1 " + year + " is");
				break;
			case 12:
				output += ("December 1 " + year + " is");
				break;
			}
			firstDay = firstDay % 7;
			switch (firstDay) {
			case 0:
				output += " Monday";
				break;
			case 1:
				output += " Tuesday";
				break;
			case 2:
				output += " Wednesday";
				break;
			case 3:
				output += " Thursday";
				break;
			case 4:
				output += " Friday";
				break;
			case 5:
				output += " Saturday";
				break;
			case 6:
				output += " Sunday";
				break;

			default:
				break;
			}
			System.out.println(output);
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				firstDay += 31;
			else if (month == 4 || month == 6 || month == 9 || month == 11)
				firstDay += 30;
			//February Leap Day control
			else {
				if (leapTrue)
					firstDay += 29;
				else
					firstDay += 28;
			}
			
		}
	}
}
