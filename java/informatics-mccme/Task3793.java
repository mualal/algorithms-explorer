import java.util.Scanner;


public class Task3793 {
    
	public static boolean IsPointInSquare(double x, double y) {
		boolean detector = (y <= -Math.abs(x) + 1 && y >= Math.abs(x) - 1);
		return (detector);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		double y = in.nextDouble();
		in.close();
		if (IsPointInSquare(x, y) == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
