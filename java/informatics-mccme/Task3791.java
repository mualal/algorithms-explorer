import java.util.Scanner;


public class Task3791 {

	public static double distance(double x1, double y1, double x2, double y2) {
		double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1)
				* (y2 - y1));
		return (distance);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		in.close();
		System.out.println(distance(x1, y1, x2, y2));
	}
}
