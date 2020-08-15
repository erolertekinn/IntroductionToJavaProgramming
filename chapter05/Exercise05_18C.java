package chapter05;

public class Exercise05_18C {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			//bosluk
			for (int j = 0; j < 6-i; j++) {
				System.out.print(" ");
			}
			//sayi
			for (int k = i; k > 0; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
