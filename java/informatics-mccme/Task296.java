import java.util.Scanner;


public class Task296 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		if (a == b && a == c) {
			System.out.println(3);
		} else {
			if (a == b || a == c || b == c) {
				System.out.println(2);
			} else {
				System.out.println(0);
			}
		}
		in.close();
	}
}
