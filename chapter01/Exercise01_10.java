//(Average Speed in Miles) 14km in 45minutes and 30seconds Hint:1mile is 1.6km
package chapter01;

public class Exercise01_10 {

	public static void main(String[] args) {
		
		double totalTripInSeconds, oneHourInSeconds, HourPerKm, totalTripInHour,HourPerMile;
		
		totalTripInSeconds = 30 + (45*60) + (45*60*60);
		oneHourInSeconds = 60 * 60 * 60;
		
		totalTripInHour = oneHourInSeconds / totalTripInSeconds;
		
		HourPerKm = 14 / totalTripInHour;
		
		HourPerMile = 1.6 * HourPerKm;
		
		
		System.out.println("The average speed in miles per hour= "+HourPerMile);
		
	}

}
