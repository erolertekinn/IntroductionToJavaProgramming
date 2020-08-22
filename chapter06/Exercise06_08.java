package chapter06;

public class Exercise06_08 {
	public static void main(String[] args) {
		System.out.printf("%-12s %6s %-12s %6s %1s %6s %-12s %6s %-12s \n", "Celsius", " ", "Fahrenheit", " ", "|", " ",
				"Fahrenheit", " ", "Celsius");
		for (int i = 0; i < 77; i++) {
			System.out.printf("%s", "-");
		}
		System.out.println();
		int gap = 40 - 31 + 1;
		double cel = 40;
		double fah = 120;
		for (int i = 1; i <= gap; i++) {

			System.out.printf("%-12.1f %6s %-12.1f %6s %1s %6s %-12.1f %6s %-12.2f \n", cel, " ",
					celsiusToFahrenheit(cel), " ", "|", " ", fah, " ", fahrenheitToCelsius(fah));
			cel--;
			fah -= 10;

		}

	}

	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;

	}
}
