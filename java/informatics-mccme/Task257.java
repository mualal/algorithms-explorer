import java.util.Scanner;
import static java.lang.Math.*;


public class Task257 {

	public static void main(String[] args) {
		int x1, y1, x2, y2;
		Scanner in = new Scanner(System.in);
		x1 = in.nextInt();
		y1 = in.nextInt();
		x2 = in.nextInt();
		y2 = in.nextInt();
		if (abs(x2 - x1) + abs(y2 - y1) == 3 && (abs(x2 - x1) == 1 || abs(y2 - y1) == 1)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		in.close();
	}
}
