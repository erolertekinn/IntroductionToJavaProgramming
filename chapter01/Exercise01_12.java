/*
Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers).
*/
package chapter01;

public class Exercise01_12 {

	public static void main(String[] args) {
		
		double km, time, kmPerHour;
		km = 24 * 1.6;
		time = 1 + (40 / 60.0) + (35 / 3600.0);
		kmPerHour = km/time;
		
		System.out.println("km per hour = "+kmPerHour);
		
	}

}
