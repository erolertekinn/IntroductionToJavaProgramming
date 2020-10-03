package chapter09.Exercise09_05;
import java.util.GregorianCalendar;

public class TestGregorianCalendar {

	public static void main(String[] args) {
		GregorianCalendar calender= new GregorianCalendar();
		
		
		System.out.print("Current year, month, and day : ");
		System.out.println(calender.get(calender.YEAR) + "/" 
		                 + calender.get(calender.MONTH) + "/" 
				         + calender.get(calender.DAY_OF_MONTH));
		
		calender.setTimeInMillis(1234567898765L);
		System.out.print("\nAfter setting year, month, and day : ");
		System.out.println(calender.get(calender.YEAR) + "/" 
                         + calender.get(calender.MONTH) + "/" 
		                 + calender.get(calender.DAY_OF_MONTH));

	}

}