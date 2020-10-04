package chapter10.Exercise10_04;

public class MyPoint {
	private double x;
	private double y;

	public MyPoint() {
		this(0,0);
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distance(MyPoint a) {
		return Math.sqrt((x - a.x) * (x - a.x) + (y - a.y) * (y - a.y));
	}

	public double distance(double x, double y) {
		return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
}