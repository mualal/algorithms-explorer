import java.util.Scanner;


public class Task112259 {

	static Scanner in = new Scanner(System.in);

	public static void solve() {
		int N = in.nextInt();
		if (N != 0) {
			solve();
			System.out.print(N + " ");
		}
	}

	public static void main(String[] args) {
		solve();
	}
}
