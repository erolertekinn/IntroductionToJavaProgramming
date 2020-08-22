package chapter06;

public class Exercise06_09 {
	public static void main(String[] args) {
		System.out.printf("%-12s %6s %-12s %6s %1s %6s %-12s %6s %-12s \n", "Feet", " ", "Meters", " ", "|", " ",
				"Meters", " ", "Feet");
		for (int i = 0; i < 77; i++) {
			System.out.printf("%s", "-");
		}
		System.out.println();
		int gap = 10 - 1 + 1;
		double feet = 1;
		double meter = 20;
		for (int i = 1; i <= gap; i++) {

			System.out.printf("%-12.1f %6s %-12.3f %6s %1s %6s %-12.1f %6s %-12.3f \n", feet, " ",
					footToMeter(feet), " ", "|", " ", meter, " ", meterToFoot(meter));
			feet++;
			meter += 5;

		}
		
	}
	public static double footToMeter(double foot) {
		double meter = 0.305 * foot;
		return meter;
	}
	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		return foot;
	}

}
