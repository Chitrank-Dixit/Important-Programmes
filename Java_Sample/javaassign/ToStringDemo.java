/* 93 WAP in java to implement toString() method in your class to print objects. */
class PointCoordinates {

	private int x, y;
	public PointCoordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	// Custom toString() Method.
	public String toString() {
		return "X=" + x + " " + "Y=" + y;
	}
}

public class ToStringDemo {

	public static void main(String args[]) {
		PointCoordinates point = new PointCoordinates(10, 10);
		System.out.println(point.toString());
		String s = point + " testing";
		System.out.println(s);
		
	}
}