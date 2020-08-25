package chapter06;

import java.util.Scanner;

public class Exercise06_25 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the Milliseconds : ");
		long millis = keyboard.nextLong();
		System.out.println("Converted version : " + convertMillis(millis));

	}

	public static String convertMillis(long millis) {
		String currentUhr = "";
		int totalSeconds = (int) (millis / 1000);
		int seconds = (int) (totalSeconds % 60);
		int totalMinutes = (int) (totalSeconds / 60);
		int minutes = (int) (totalMinutes % 60);
		int hour = (int) (totalMinutes / 60);
		return currentUhr = currentUhr + hour + ":" + minutes + ":" + seconds;

	}

}
