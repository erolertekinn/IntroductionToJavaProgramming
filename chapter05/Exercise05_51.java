package chapter05;

import java.util.Scanner;

public class Exercise05_51 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the first string:");
		String str1 = keyboard.nextLine();
		System.out.print("Enter the second string:");
		String str2 = keyboard.nextLine();
		
		String commonPrefix = "";
		for (int i = 0; str1.charAt(i) == str2.charAt(i); i++) {
			commonPrefix = commonPrefix + str1.charAt(i);
			
		}
		
		if(commonPrefix.length()>0){
			System.out.println("The common prefix is "+commonPrefix);
		}else {
			System.out.println(str1+" and "+str2+"have nothing in common prefix");
		}
	}
}
