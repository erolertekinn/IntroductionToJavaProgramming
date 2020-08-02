package chapter03;

import java.util.Scanner;

public class Exercise03_27 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a point's x- and y-coordinates: ");
		int x1 = keyboard.nextInt();
		int y1 = keyboard.nextInt();

		if ((x1 > 1) || (y1 > 1)) {
			for (int x = 0; x <= 200; x++) {
				for (int y = 100; y >= 0; y--) {
					// hipotenus = x^2-y^2
					double hip = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
					if (hip == Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2))) {
						System.out.println("The point is in the triangle");
						System.exit(0);
					}
				}

			}
		}

	}
}
