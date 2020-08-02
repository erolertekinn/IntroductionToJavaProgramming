package chapter04;

public class Exercise04_06 {

	public static void main(String[] args) {
		// THIS QUESTION IS NOT FINISHED YET
		
		final double RADIUS = 40;

		double ang1 = (Math.random() * (2 * Math.PI));
		double ang2 = (Math.random() * (2 * Math.PI));
		double ang3 = (Math.random() * (2 * Math.PI));

		double x1 = RADIUS * Math.cos(ang1);
		double y1 = RADIUS * Math.sin(ang1);
		double x2 = RADIUS * Math.cos(ang2);
		double y2 = RADIUS * Math.sin(ang2);
		double x3 = RADIUS * Math.cos(ang3);
		double y3 = RADIUS * Math.sin(ang3);
	}

}
