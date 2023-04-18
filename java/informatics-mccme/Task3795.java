import java.util.Scanner;


public class Task3795 {

	public static boolean IsPointInArea(double x, double y) {
		boolean detector = ((y > 0 && y >= 2 * x + 2 && y >= -x && ((Math.pow(x + 1, 2) + Math.pow(y - 1, 2)) <= 4))
				|| (y < 0 && y <= 2 * x + 2 && y <= -x && ((Math.pow(x + 1, 2) + Math.pow(y - 1, 2)) >= 4)));

		return (detector);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		double y = in.nextDouble();
		in.close();
		if (IsPointInArea(x, y) == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
