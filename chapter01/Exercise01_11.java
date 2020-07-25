//*One birth every 7 seconds
//*One death every 13 seconds
//*One new immigrant every 45 seconds
//currentPop:312032486	oneYear:356
package chapter01;

public class Exercise01_11 {

	public static void main(String[] args) {
		
		int oneDayInSeconds,oneYearInSeconds,increasePerYear,currentPop,UpToDatePerYearPop;
		
		currentPop=312032486;
		
		oneDayInSeconds = 24 * 60 * 60;
		oneYearInSeconds = 365 * oneDayInSeconds;
		
		increasePerYear = (oneYearInSeconds/7)-(oneYearInSeconds/13)+(oneYearInSeconds/45);
		UpToDatePerYearPop = currentPop + increasePerYear;
		
		for(int i = 1; i < 6; i++)
		{
			System.out.println(i+".years population is equal = "+UpToDatePerYearPop);
			UpToDatePerYearPop = UpToDatePerYearPop + increasePerYear;
		}
		
	}

}
