package chapter03;

import java.util.Scanner;

public class Exercise03_05 {

	public static void main(String[] args) {
		int todaysDay, elapsedDay,futureDay;
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter today`s day (Sunday is 0, Monday is 1, ...,) :");
		todaysDay = keyboard.nextInt();
		
		while (todaysDay < 0 || todaysDay > 6) {
			System.out.print("Please enter a value between 0 und 6 :");
			todaysDay = keyboard.nextInt();	
		}
		
		System.out.print("Enter the number of days elapsed since today :");
		elapsedDay = keyboard.nextInt();
		
		futureDay = (elapsedDay + todaysDay) % 7;

		System.out.print("This is ");
		switch (todaysDay)
		{
			case 0: System.out.print("Sunday"); break;
			case 1: System.out.print("Monday"); break;
			case 2: System.out.print("Tuesday"); break;
			case 3: System.out.print("Wednesday"); break;
			case 4: System.out.print("Thursday"); break;
			case 5: System.out.print("Friday"); break;
			case 6: System.out.print("Saturday");break;
		}
		System.out.print(" and the future day is ");
		switch (futureDay)
		{
			case 0: System.out.print("Sunday"); break;
			case 1: System.out.print("Monday"); break;
			case 2: System.out.print("Tuesday"); break;
			case 3: System.out.print("Wednesday"); break;
			case 4: System.out.print("Thursday"); break;
			case 5: System.out.print("Friday"); break;
			case 6: System.out.print("Saturday");break;
		}
		
	
	}
	
}