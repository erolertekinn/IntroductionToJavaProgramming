package chapter06;

import java.util.Scanner;

public class Exercise06_04 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number :");
		int number = keyboard.nextInt();
		reverse(number);

	}
	public static void reverse(int number) {
		String reverseStr = "";
		String numberStr = number+"";
		
		for (int i=(numberStr.length()-1) ; i >= 0; i--) {
			char digitChr = numberStr.charAt(i);
			reverseStr = reverseStr + digitChr;
			
		}
		int reverseInt = Integer.parseInt(reverseStr);
		System.out.println("Reverse of this number is :"+reverseInt);
	}
}
