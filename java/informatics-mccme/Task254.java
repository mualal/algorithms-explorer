import java.util.Scanner;


public class Task254 {

	public static void main(String[] args) {
		int x1, y1, x2, y2;
		Scanner in = new Scanner(System.in);
		x1 = in.nextInt();
		y1 = in.nextInt();
		x2 = in.nextInt();
		y2 = in.nextInt();
		if (x1 == x2 || y1 == y2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
			close(in);
		}
	}

	private static void close(Scanner in) {
	}
}
