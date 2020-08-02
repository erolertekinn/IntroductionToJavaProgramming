package chapter04;

import java.util.Scanner;

public class Exercise04_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a hex digit: ");
		char hexDigit = input.next().charAt(0);
		
		switch(hexDigit){
		case('A'):System.out.println("The binary value is 1010");break;
		case('B'):System.out.println("The binary value is 1011");break;
		case('C'):System.out.println("The binary value is 1100");break;
		case('D'):System.out.println("The binary value is 1101");break;
		case('E'):System.out.println("The binary value is 1110");break;
		case('F'):System.out.println("The binary value is 1111");break;
		
		}
		if((int)hexDigit>70 || (int)hexDigit<60){
			System.out.println("Invalid input");
		}
	}
}
