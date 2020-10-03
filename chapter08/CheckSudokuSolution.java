package chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class CheckSudokuSolution {
	public static void main(String[] args) {
		int[][] array = readSudokuSolution();
		System.out.println(
				is1to9row(array) && is1to9column(array) && is3to3rec(array) ? "Sudoku is true" : "Sudoku is not true");
	}

	public static int[][] readSudokuSolution() {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter your Sudoku solution : ");
		int[][] solutions = new int[9][9];

		for (int i = 0; i < solutions.length; i++) {
			for (int j = 0; j < solutions[i].length; j++) {
				solutions[i][j] = keyboard.nextInt();
			}
		}

		return solutions;
	}

	public static boolean is1to9row(int[][] array) {

		for (int row = 0; row < array.length; row++) {
			int[] control = new int[array.length];
			for (int column = 0; column < array[row].length; column++) {
				control[column] = array[row][column];
			}
			Arrays.sort(control);
			for (int j = 0; j < control.length; j++) {
				if (control[j] != (j + 1)) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean is1to9column(int[][] array) {

		for (int column = 0; column < array.length; column++) {
			int[] control = new int[array.length];
			for (int row = 0; row < array[column].length; row++) {
				control[row] = array[column][row];
			}
			Arrays.sort(control);
			for (int j = 0; j < control.length; j++) {
				if (control[j] != (j + 1)) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean is3to3rec(int[][] array) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				int k = 0;
				int[] list = new int[9];
				for (int row = i * 3; row < i * 3 + 3; row++)
					for (int column = j * 3; column < j * 3 + 3; column++) {
						list[k++] = array[row][column];
					}
				Arrays.sort(list);
				for (int l = 0; l < list.length; l++) {
					if (list[i] != (i + 1)) {
						return false;
					}
				}
			}
		}

		return true;
	}

}
