package chapter06;

import java.util.Scanner;

public class Exercise06_23 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String str = keyboard.nextLine();
		System.out.print("Enter the character :");
		String str2 = keyboard.nextLine();
		char chr=str2.charAt(0);
		System.out.print("Number of the repeat character: "+count(str,chr));
		
		
		

	}

	public static int count(String str, char chr) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==chr)
				counter++;
			
		}
		
		return counter;
	}
}
