package chapter07;

import java.util.Scanner;

/*
**7.17 (Sort students) Write a program that prompts the user to enter the number of students,
the students’ names, and their scores, and prints student names in decreasing
order of their scores.
 */
public class Exercise07_17 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int x = keyboard.nextInt();

		String[] studentsName = new String[x];
		int[] studentScores = new int[x];

		for (int i = 0; i < x; i++) {
			System.out.print((i + 1) + "." + "Enter the students name: ");
			studentsName[i] = keyboard.next();
			System.out.print((i + 1) + "." + "Enter the score of  students: ");
			studentScores[i] = keyboard.nextInt();
		}
		
		decreasingOrder(studentScores,studentsName);
		printStudentsResults(studentScores,studentsName);

	}

	public static void decreasingOrder(int[] studentScores,String[] studentsName) {
		
		for (int j = 0; j < studentScores.length; j++) {
			int max = studentScores[j];
			for (int i = j+1; i < studentScores.length; i++) {
				if (studentScores[i] > max) {
					max = studentScores[i];
					int tempScore = studentScores[i];
					String tempName = studentsName[i];
					studentScores[i] = studentScores[j];
					studentsName[i] = studentsName[j];
					studentsName[j]=tempName;
					studentScores[j] = tempScore;


				}
			}
		}
	}
	public static void printStudentsResults(int[] studentScores,String[] studentsName) {
		for (int i = 0; i < studentsName.length; i++) {
			System.out.println(studentsName[i]+" :"+studentScores[i]+" points");
		}
	}

}
