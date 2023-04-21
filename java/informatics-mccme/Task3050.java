import java.util.Scanner;


public class Task3050 {

	public static void Hanoy(int quantity, int from, int to, int time) {
		if (quantity > 0) {
			Hanoy(quantity - 1, from, time, to);
			System.out.print(quantity + " " + from + " " + to);
			System.out.println();
			Hanoy(quantity - 1, time, to, from);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Hanoy(n, 1, 3, 2);
		in.close();
	}
}
