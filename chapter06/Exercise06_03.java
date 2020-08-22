package chapter06;

import java.util.Scanner;

public class Exercise06_03 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the number :");
		int number = keyboard.nextInt();
		System.out.print("Reverse of this number is :" + reverse(number));
		System.out.println(isPalindrome(number) == true ? "\nThis number is Palindrome" : "\nThis number is not Palindrome");

	}

	public static boolean isPalindrome(int number) {
		boolean palindrome = false;

		if(reverse(number)==number)
			palindrome=true;
		return palindrome;
	}
	
	public static int reverse(int number) {
		int sum = 0;
		String reverseString = "";
		int reverseInt;
		while (number > 0) {
			//546   sum=6  n=54   sum=6+4   n=5  sum=6+4+5 n=0
			sum =  number % 10;
			reverseString = reverseString+Integer.toString(sum);
			number = number / 10;

		}
		
		return reverseInt = Integer.parseInt(reverseString);
	}

}
