package chapter03;

import java.util.Scanner;

public class Exercise03_30 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the time zone offset to GMT: ");
		int offset = keyboard.nextInt();

		// total milliseconds
		long totalMilliseconds = System.currentTimeMillis();

		// total seconds
		long totalSeconds = totalMilliseconds / 1000;

		// current second
		long currentSecond = totalSeconds % 60;

		// total minutes
		long totalMinutes = totalSeconds / 60;

		// current minute
		long currentMinute = totalMinutes % 60;

		// total hours
		long totalHours = totalMinutes / 60;

		// hour
		long currentHour = totalHours % 24;
		currentHour = currentHour + offset;

		if (currentHour > 12) {
			currentHour = currentHour - 12;
			System.out
					.println("Current time is " + currentHour + " : " + currentMinute + " : " + currentSecond + " PM");
		} else {
			System.out
					.println("Current time is " + currentHour + " : " + currentMinute + " : " + currentSecond + " AM");
		}
	}

}
