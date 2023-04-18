import java.util.Scanner;


public class Task3794 {

	public static boolean IsPointInCircle(double x, double y, double x0, double y0, double r) {
		boolean detector = (Math.pow(x - x0, 2) + Math.pow(y - y0, 2)) <= Math.pow(r, 2);
		return (detector);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		double y = in.nextDouble();
		double x0 = in.nextDouble();
		double y0 = in.nextDouble();
		double r = in.nextDouble();
		in.close();
		if (IsPointInCircle(x, y, x0, y0, r) == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
