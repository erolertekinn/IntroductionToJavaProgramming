package chapter07;

import java.util.Scanner;

public class Exercise07_01 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the number of students : ");
		int numberOfStudents = keyboard.nextInt();

		int[] scoresOfStudents = new int[numberOfStudents];

		System.out.print("Enter " + numberOfStudents + " scores : ");
		for (int i = 0; i < scoresOfStudents.length; i++) {
			scoresOfStudents[i] = keyboard.nextInt();
		}

		char[] examResult = new char[numberOfStudents];
		examResultAsLetter(scoresOfStudents, examResult);

		printTheResults(scoresOfStudents, examResult);

	}

	public static void printTheResults(int[] scoresOfStudents, char[] examResult) {
		for (int i = 0; i < scoresOfStudents.length; i++) {
			System.out.println("Student " + i + " score is " + scoresOfStudents[i] + " and grade is " + examResult[i]);
		}
	}

	public static char[] examResultAsLetter(int[] scoresOfStudents, char[] examResult) {
		for (int i = 0; i < scoresOfStudents.length; i++) {
			if (scoresOfStudents[i] >= (bestGrade(scoresOfStudents) - 10)) {
				examResult[i] = 'A';
			}
			else if (scoresOfStudents[i] >= (bestGrade(scoresOfStudents) - 20)) {
				examResult[i] = 'B';
			}
			else if (scoresOfStudents[i] >= (bestGrade(scoresOfStudents) - 30)) {
				examResult[i] = 'C';
			}
			else if (scoresOfStudents[i] >= (bestGrade(scoresOfStudents) - 40)) {
				examResult[i] = 'D';
			} else {
				examResult[i] = 'F';
			}

		}
		return examResult;
	}

	public static int bestGrade(int[] scoresOfStudents) {
		int best = 0;
		for (int i = 0; i < scoresOfStudents.length; i++) {

			if (best < scoresOfStudents[i]) {
				best = scoresOfStudents[i];
			}
		}
		return best;
	}
}
