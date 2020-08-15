package chapter05;

import java.util.Scanner;

public class Exercise05_08 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int highestScore = 0;
		String highestScoreName = "";

		System.out.print("Enter the number of the Students: ");
		int numberOfStudent = keyboard.nextInt();

		for (int i = 0; i < numberOfStudent; i++) {
			System.out.println((i + 1) + ". Student");
			System.out.print("Name : ");
			String name = keyboard.next();
			System.out.print("Score : ");
			int score = keyboard.nextInt();

			if (score > highestScore) {
				highestScore = score;
				highestScoreName = name;
			}
		}
		System.out.println("Student with them highest score is " + highestScoreName + "\nHis score is " + highestScore);
	}
}