package chapter03;

import java.util.Scanner;

public class Exercise03_12 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter a three-digit integer :");
			int threeDigitNum = input.nextInt();
			
			while(!(threeDigitNum < 1000 && threeDigitNum > 99)) {
				System.out.print("Please enter a value between 100-999 :");
				threeDigitNum = input.nextInt();
			}
			//d3d2d1
			int d1 = threeDigitNum % 10;
			int d2 = (threeDigitNum / 10) % 10;
			int d3 = threeDigitNum / 100;

			if(d1 == d3) {
				System.out.println(threeDigitNum+" is a palindrome");
			}
			else {
				System.out.println(threeDigitNum+" is not a palindrome");
			}
	}

}
