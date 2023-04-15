import java.util.Scanner;


public class Task261 {

	public static void main(String[] args) {
		double a, b, c, d, x;
		Scanner in = new Scanner(System.in);
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		d = in.nextDouble();
		x = -b / a;
		if ((a == 0) && b != 0) {
			System.out.println("NO");
		} else {
			if ((a == 0) && (b == 0)) {
				System.out.println("INF");
			} else {
				if ((b % a) == 0 && x != (-d / c)) {
					System.out.println((int)(-b / a));
				} else {
					System.out.println("NO");
					close(in);
				}
			}
		}
	}

	private static void close(Scanner in) {
	}
}
