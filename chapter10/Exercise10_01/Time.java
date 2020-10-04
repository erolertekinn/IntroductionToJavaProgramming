package chapter10.Exercise10_01;

public class Time {
	long hour;
	long minute;
	long second;

	public Time() {
		setTime(System.currentTimeMillis());
	}

	public Time(long elapsedTime) {
		setTime(elapsedTime);
	}

	public Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	private void setTime(long elapsedTime) {
		long totalSecond = elapsedTime / 1000;
		second = totalSecond % 60;
		long totalMinutes = totalSecond / 60;
		minute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		hour = totalHours % 24;
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

}
