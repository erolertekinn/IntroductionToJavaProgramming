package chapter05;

import java.util.Scanner;

public class Exercise05_09 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int highestGrade1 = 0;
		String highestName1 = " ";
		int highestGrade2 = 0;
		String highestName2 = " ";
		
		System.out.print("Enter the number of students: ");
		int numberOfStudents = keyboard.nextInt();
		
		System.out.println("Enter the name and score: ");

		for (int i = 0; i < numberOfStudents; numberOfStudents--) {
			
			int c = 1;
			System.out.println(c + ". Student");
			
			System.out.print("Name : ");
			String nameOfTheStudent = keyboard.next();
			
			System.out.print("Score : ");
			int score = keyboard.nextInt();
		
			if (score > highestGrade1) {
				highestGrade2 = highestGrade1;
				highestName2 = highestName1;

				highestGrade1 = score;
				highestName1 = nameOfTheStudent;

			} else if (score > highestGrade2) {
				highestGrade2 = score;
				highestName2 = nameOfTheStudent;

			}
			c++;
		}

		System.out.println("Student with them highest score is " + highestName1 + "\nHis score is " + highestGrade1);
		System.out.println("Student with them second highest score is " + highestName2 + "\nHis score is " + highestGrade2);

	}
}
