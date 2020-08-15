package chapter05;

public class Exercise05_06 {
	public static void main(String[] args) {
		System.out.print("Miles    Kilometers    |       Kilometers  Miles");
		for (int i = 1, j = 20; i < 11 && j < 66; i++, j += 5) {
			System.out.printf("\n%-5d    %-10.3f    |    %5d     %10.3f",i,(i*1.609),j,(j/1.609));

		}
	}
}
