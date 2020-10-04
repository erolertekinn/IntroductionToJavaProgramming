package chapter10.Exercise10_05;

import java.util.Scanner;

public class StackOfIntegerTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		
		StackOfIntegers stackOfInteger1 = new StackOfIntegers(); 
		smallestFactors(number, stackOfInteger1);	
		
		System.out.print("The smallest factors of " + number + " are: ");
		
		while (!stackOfInteger1.empty()) {
			System.out.print(stackOfInteger1.pop() + " ");
		}
		System.out.println();
	}

	public static void smallestFactors(int number, StackOfIntegers stackOfInteger) {
		int i = 2;
		while (number / i != 1){ 
			if (number % i == 0) {
				stackOfInteger.push(i);
				number /= i;
			}
			else
				i++;
		}
		stackOfInteger.push(number);
	}

}
