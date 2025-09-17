package javaPractice;

public class Area {
	public static double areaOfCircle(int r) {
		return 3.14 * r * r;
	}

	public static double areaOfRectangle(double length, double width) {
		return length * width;
	}

	public static double areaOfTriangle(double height, double base) {
		return (base * height) / 2;
	}
	
	public static void volumeOfSphere(double radius) {
		double volume = 1.33 * radius * radius * radius;
		System.out.println(volume);
		
	}

}
