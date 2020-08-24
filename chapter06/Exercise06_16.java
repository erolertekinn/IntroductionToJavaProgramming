package chapter06;

public class Exercise06_16 {
	public static void main(String[] args) {
		for (int i = 2000; i <= 2020; i++) {
			System.out.println("At "+i+", number of the days is : "+numberOfDaysInAYear(i));
			
		}

	}
	public static int numberOfDaysInAYear(int year){
	
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		
		return isLeapYear ? 366 : 365;
		 
	}
}
