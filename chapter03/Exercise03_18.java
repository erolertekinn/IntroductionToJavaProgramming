package chapter03;

import java.util.Scanner;

public class Exercise03_18 {

	public static void main(String[] args) {
		double w;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the weight of the package : ");
		w = keyboard.nextDouble();

		if(0 < w && w <= 1) {
			System.out.println("The shipping cost :"+(3.5*w));
		}
		else if(w <= 3) {
			System.out.println("The shipping cost :"+(5.5*w));
		}
		else if(w <= 10) {
			System.out.println("The shipping cost :"+(8.5*w));
		}
		else if(w <= 20) {
			System.out.println("The shipping cost :"+(10.5*w));
		}
		else if(w > 50) {
			System.out.println("The package cannot be shipped.");
		}

	}

}
