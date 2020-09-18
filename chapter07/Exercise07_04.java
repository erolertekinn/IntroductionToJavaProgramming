package chapter07;

import java.util.Scanner;

/*
7.4 (Analyze scores) Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume that the maximum number of scores is 100.
*/
public class Exercise07_04 {

	public static void main(String[] args) {
		int[] scores = new int[100];
		int inputCounter = readNumbers(scores);
		int averageValue = average(scores, inputCounter);
		
		print(scores,inputCounter, averageValue);
	}

	public static int average(int[] scores, int inputCounter) {
		int top = 0;
		for (int i = 0; i < inputCounter; i++) {
			top = top + scores[i];
		}
		int average = top / inputCounter;
		return average;
	}

	public static int readNumbers(int[] scores) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the values : ");
		int nbr;
		int counter = 0;
		do {

			nbr = keyboard.nextInt();
			if (nbr > 0) {
				scores[counter] = nbr;
				counter++;
			}

		} while (nbr > 0);
		return counter;
	}

	public static void print(int[] scores, int inputCounter, int averageValue) {
		for (int i = 0; i < inputCounter; i++) {
			if (scores[0] < averageValue) {
				System.out.println("Score :" + scores[i] + " Average :" + averageValue + " is less than average value");
			} else if (scores[0] > averageValue) {
				System.out
						.println("Score :" + scores[i] + " Average :" + averageValue + " is grater than average value");
			} else {
				System.out.println("Score :" + scores[i] + " Average :" + averageValue + " is equal to average value");
			}
		}
	}

}
