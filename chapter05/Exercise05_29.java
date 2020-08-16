package chapter05;

import java.util.Scanner;

public class Exercise05_29 {
	public static void main(String[] args) {
		//TODO NICHT FERTIG
		Scanner keyboard = new Scanner(System.in);
	
		System.out.print("Enter the current year: ");
		int year = keyboard.nextInt();
		System.out.print("Enter the firt day of the calendar: ");
		int firstTag = keyboard.nextInt();
		
		
		for (int month = 1; month <= 12; month++) {
			String header = "";
			switch (month) {
			case 1: header += " January"; break;
			case 2: header += " February"; break;
			case 3: header += " March"; break;
			case 4: header += " April"; break;
			case 5: header += " May"; break;
			case 6: header += " June"; break;
			case 7: header += " July"; break;
			case 8: header += " August"; break;
			case 9: header += " September"; break;
			case 10: header += " October"; break;
			case 11: header += " November"; break;
			case 12: header += " December"; break;
			}
			
			header = header +" "+ year;
			String tire ="----------------------------------------";
			int a = tire.length();
			a = a/2;
			for (int i = 0; i < a-5; i++) {
				System.out.print(" ");
			}
			System.out.println(header);
			System.out.println(tire);
			System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
			

		}


	}
	}


	