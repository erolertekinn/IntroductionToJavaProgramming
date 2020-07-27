package chapter02;

import java.util.Scanner;

public class Exercise02_08 {

	public static void main(String[] args) {
		int offset;
		long totalMilliSeconds,currentMilliSeconds,totalSeconds,currentSeconds,totalMinutes,currentMinutes,totalHour,currentHour;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the time zone offset to GMT: "); 
		offset = keyboard.nextInt();
		
		totalMilliSeconds = System.currentTimeMillis();
		currentMilliSeconds = totalMilliSeconds % 1000;
		totalSeconds = totalMilliSeconds / 1000;
		
		currentSeconds = totalSeconds % 60;
		totalMinutes = totalSeconds / 60;
		
		currentMinutes = totalMinutes % 60;
		totalHour = totalMinutes / 60;
		
		currentHour = totalHour + offset;
		if(currentHour > 24) {
			currentHour = currentHour % 24;
		}
		
		
		System.out.println("The current time is "+currentHour+":"+currentMinutes+":"+currentSeconds);

	}

}
